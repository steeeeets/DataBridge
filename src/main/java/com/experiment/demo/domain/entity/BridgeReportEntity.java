package com.experiment.demo.domain.entity;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class BridgeReportEntity {

    @NotEmpty
    private Date timestamp = new Date();

    @Valid
    @NotEmpty
    private List<BridgeEntity> bridges = new ArrayList<>();
}
