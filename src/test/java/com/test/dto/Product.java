package com.test.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private String productCode;

    private String productVersion;

    private String unit;

    private String productName;

    private String qty;

    public String getCodeAndVersion() {
        return this.productCode + this.productVersion;
    }
}
