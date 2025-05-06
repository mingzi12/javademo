package com.design.parrten.decoration;

import java.math.BigDecimal;

public class BoBoMilkTea implements MilkTea{
    @Override
    public String description() {
        return "波波奶茶";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(8.0);
    }
}
