package com.at.stripepayment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

  @GetMapping("${api.v1.baseUrl}/health-check")
  public String healthCheck() {
    return "server is up and running";
  }
}
