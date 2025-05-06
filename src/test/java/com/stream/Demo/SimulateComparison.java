package com.stream.Demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SimulateComparison {

    private String productId;

    private String month;

    private String capability;

    private BigDecimal supplyQty;

    private BigDecimal groupSupplyQty;

    private BigDecimal demandToolQty;

    private BigDecimal recommendQty;
}
