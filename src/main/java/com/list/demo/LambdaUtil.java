package com.list.demo;

import com.alibaba.fastjson.JSON;
import com.dto.Product;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaUtil {

    public static void main(String[] args) {
        Collection<Product> productList = generateList();
        Map<String, Collection<Product>> prodMapByCode = toMapWithList(productList, Product::getProductCode);
        System.out.println(JSON.toJSONString(prodMapByCode));
        Map<String, Product> mapByCode = toMap(productList, Product::getProductCode);
        System.out.println(JSON.toJSONString(mapByCode));
        Map<String, Product> mapByCodeAndVersion = toMap(productList, Product::getCodeAndVersion);
        System.out.println(JSON.toJSONString(mapByCodeAndVersion));
        Map<String, Map<String, Product>> mapWithMapList = toMapWithMapList(productList, Product::getProductCode,
                Product::getProductVersion);
        System.out.println(mapWithMapList);
    }


    public static <K, E> Map<K, Collection<E>> toMapWithList(Collection<E> list, Function<E, K> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        Map<K, Collection<E>> map = new HashMap<>();
        for (E item : list) {
            K key = keyExtractor.apply(item);
            if (Objects.isNull(map.get(key))) {
                List<E> valueList = new ArrayList<>();
                valueList.add(item);
                map.put(key, valueList);
            } else {
                map.get(key).add(item);
            }
        }
        return map;
    }

    public static <K, E> Map<K, E> toMap(Collection<E> list, Function<E, K> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        Map<K, E> map = new HashMap<>();
        for (E item : list) {
            K key = keyExtractor.apply(item);
            map.putIfAbsent(key, item);
        }
        return map;
    }

    public static <K, E> Map<K, Map<K, E>> toMapWithMapList(Collection<E> list, Function<E, K> keyExtractor,
                                                            Function<E, K> valueKeyExtractor) {
        Objects.requireNonNull(keyExtractor);
        Objects.requireNonNull(valueKeyExtractor);
        Map<K, Map<K, E>> map = new HashMap<>();
        for (E item : list) {
            K key = keyExtractor.apply(item);
            Map<K, E> valueMap = map.putIfAbsent(key, new HashMap<>());
            if (Objects.isNull(valueMap)) {
                map.get(key).put(valueKeyExtractor.apply(item), item);
            }
        }
        return map;
    }

    public static Collection<Product> generateList() {
        Product p01 = Product.builder().productCode("P01").productVersion("V01").productName("P01").build();
        Product p02 = Product.builder().productCode("P02").productVersion("V02").productName("P02").build();
        Product p03 = Product.builder().productCode("P02").productVersion("V02").productName("P02").build();
        Product p04 = Product.builder().productCode("P03").productVersion("V03").productName("P03").build();
        return Stream.of(p01, p02, p03, p04).collect(Collectors.toList());

    }
}
