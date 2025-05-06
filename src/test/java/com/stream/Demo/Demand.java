package com.stream.Demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
public class Demand {

    private String productId;

    private String month;

    private BigDecimal productQty;

}
