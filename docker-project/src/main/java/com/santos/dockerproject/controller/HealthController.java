package com.santos.dockerproject.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public HealthStatus healthStatus(){
        return new HealthStatus("UP");
    }

    @Getter
    @RequiredArgsConstructor
    private static final class HealthStatus {
        private final String status;
    }
}
