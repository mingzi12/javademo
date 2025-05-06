package com.stream.Demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
public class ResourceCapability {

    private String capability;

    private String month;

    private BigDecimal supplyQty;

}
