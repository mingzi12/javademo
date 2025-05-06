package com.stream.Demo;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void forTest1() {
        AtomicInteger integer = new AtomicInteger();
        List<SimulateComparison> comparisons = getData();
        Map<String, Map<String, List<SimulateComparison>>> mapByMonthAndCap = comparisons.stream().collect(
                Collectors.groupingBy(SimulateComparison::getMonth,
                        Collectors.groupingBy(SimulateComparison::getCapability)));
        long start = System.currentTimeMillis();
        for (Map<String, List<SimulateComparison>> mapListByMonthAndCap : mapByMonthAndCap.values()) {
            for (List<SimulateComparison> listByCapInMonth : mapListByMonthAndCap.values()) {
                listByCapInMonth.forEach(cap -> {
                    BigDecimal usedToolQty =
                            listByCapInMonth.stream().filter(item -> {
                                        integer.incrementAndGet();
                                        return !item.getProductId().equals(cap.getCapability());
                                    }).map(SimulateComparison::getDemandToolQty).reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal recommendQty =
                            cap.getGroupSupplyQty().subtract(usedToolQty).multiply(new BigDecimal(2014));
                    cap.setRecommendQty(recommendQty);
                });
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("comparisons size : " + comparisons.size() + ";循环总次数： " + integer.get()
                + "; stream耗时： " + (end - start));
    }

    @Test
    public void streamTest2() {
        AtomicInteger integer = new AtomicInteger();
        List<SimulateComparison> comparisons = getData();
        Map<String, Map<String, List<SimulateComparison>>> mapByMonthAndCap = comparisons.stream().collect(
                Collectors.groupingBy(SimulateComparison::getMonth,
                        Collectors.groupingBy(SimulateComparison::getCapability)));
        long start = System.currentTimeMillis();
        for (Map<String, List<SimulateComparison>> mapListByMonthAndCap : mapByMonthAndCap.values()) {
            for (List<SimulateComparison> listByCapInMonth : mapListByMonthAndCap.values()) {
                BigDecimal usedToolQty = BigDecimal.ZERO;
                for (SimulateComparison simulateComparison1 : listByCapInMonth) {
                    for (SimulateComparison simulateComparison2 : listByCapInMonth) {
                        integer.incrementAndGet();
                        if (!simulateComparison1.getProductId().equals(simulateComparison2.getCapability())) {
                            usedToolQty = usedToolQty.add(simulateComparison2.getDemandToolQty());
                        }
                    }
                    BigDecimal recommendQty =
                            simulateComparison1.getGroupSupplyQty().subtract(usedToolQty).multiply(new BigDecimal(2014));
                    simulateComparison1.setRecommendQty(recommendQty);
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("comparisons size : " + comparisons.size() + ";循环总次数： " + integer.get()
                + "; for i循环耗时： " + (end - start));
    }


    @Test
    public void parallelTest3() {
        AtomicInteger integer = new AtomicInteger();
        List<SimulateComparison> comparisons = getData();
        Map<String, Map<String, List<SimulateComparison>>> mapByMonthAndCap = comparisons.parallelStream().collect(
                Collectors.groupingBy(SimulateComparison::getMonth,
                        Collectors.groupingBy(SimulateComparison::getCapability)));
        long start = System.currentTimeMillis();
        for (Map<String, List<SimulateComparison>> mapListByMonthAndCap : mapByMonthAndCap.values()) {
            for (List<SimulateComparison> listByCapInMonth : mapListByMonthAndCap.values()) {
                listByCapInMonth.forEach(cap -> {
                    BigDecimal usedToolQty =
                            listByCapInMonth.parallelStream().filter(item -> {
                                        integer.incrementAndGet();
                                        return !item.getProductId().equals(cap.getCapability());
                                    }).map(SimulateComparison::getDemandToolQty).reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal recommendQty =
                            cap.getGroupSupplyQty().subtract(usedToolQty).multiply(new BigDecimal(2014));
                    cap.setRecommendQty(recommendQty);
                });
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("comparisons size : " + comparisons.size() + ";循环总次数： " + integer.get()
                + "; parallelStream耗时： " + (end - start));
    }

    public static List<String> getMonths() {
        List<String> months = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            if (i >= 10) {
                months.add("2023/" + i);
            } else {
                months.add("2023/0" + i);
            }
        }
        return months;
    }

    public static List<SimulateComparison> getData() {
        String productId = "MC";
        String cap = "xznl";
        List<String> months = getMonths();
        List<SimulateComparison> simulateComparisons = new ArrayList<>(1024000);
        for (String month : months) {
            for (int i = 0; i < 100; i++) {
                String tempPID = productId + i;
                for (int j = 0; j < 1000; j++) {
                    SimulateComparison simulateComparison = new SimulateComparison();
                    simulateComparison.setMonth(month);
                    simulateComparison.setProductId(tempPID);
                    simulateComparison.setCapability(cap + j);
                    simulateComparison.setDemandToolQty(BigDecimal.valueOf(0.2));
                    simulateComparison.setSupplyQty(BigDecimal.ONE);
                    simulateComparison.setGroupSupplyQty(BigDecimal.ONE);
                    simulateComparisons.add(simulateComparison);
                }
            }
        }
        return simulateComparisons;
    }
}
