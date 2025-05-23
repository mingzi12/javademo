package com.design.parrten.decoration;

import java.math.BigDecimal;

/**
 * 椰果
 */
public class Coconut implements Condiment {

    private MilkTea milkTea;

    public Coconut(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String description() {
        return milkTea.description() + "," + "加椰果";
    }

    @Override
    public BigDecimal cost() {
        return milkTea.cost().add(new BigDecimal(1.5));
    }
}
