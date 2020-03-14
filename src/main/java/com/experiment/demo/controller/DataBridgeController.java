package com.experiment.demo.controller;

import com.experiment.demo.domain.entity.BridgeReportEntity;
import com.experiment.demo.service.BridgeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class DataBridgeController {

    @Autowired
    BridgeDataService bridgeDataService;

    @GetMapping("/connection")
    public String greeting() {
        return "Connected.";
    }

    @PostMapping("/api/content")
    public BridgeReportEntity showContent(@Valid @RequestBody BridgeReportEntity bridgeReportEntity) {
        return bridgeDataService.showBridgeDataToUno(bridgeReportEntity);
    }

    @PostMapping("/api/bridge")
    public void postBridgeData(@Valid @RequestBody BridgeReportEntity bridgeReportEntity) {
        bridgeDataService.postBridgeDataToUno(bridgeReportEntity);
    }
}
