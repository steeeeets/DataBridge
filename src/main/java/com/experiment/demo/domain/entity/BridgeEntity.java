package com.experiment.demo.domain.entity;

import lombok.Data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;


@Data
public class BridgeEntity {

    private long id;

    @NotEmpty
    private String content;

    @DecimalMin("2000")
    @DecimalMax("2049")
    private int year = 2049;

    @DecimalMin("100")
    private int length = 100;

    private String unit = "m";

}
