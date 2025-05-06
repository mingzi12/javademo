package com.stream.Demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Data
@Builder
@AllArgsConstructor
public class SetPerK {

    private String productId;

    private String capability;

    private BigDecimal setPerK;

    private BigDecimal kPerSet;


}
