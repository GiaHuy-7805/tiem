package com.tiem.backend.common.web;

import com.tiem.backend.common.response.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping
    public ApiResponse<Map<String, Object>> health() {

        return ApiResponse.ok(
                Map.of(
                        "status", "UP",
                        "service", "tiem-backend",
                        "time", Instant.now().toString()
                )
        );
    }
}