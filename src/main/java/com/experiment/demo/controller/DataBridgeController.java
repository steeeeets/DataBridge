package com.experiment.demo.controller;

import com.experiment.demo.domain.entity.BridgeDataEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DataBridgeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public BridgeDataEntity greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new BridgeDataEntity(counter.incrementAndGet(), String.format(template, name));
    }
}
