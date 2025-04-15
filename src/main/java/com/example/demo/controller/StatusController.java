package com.example.demo.controller;

import com.example.demo.dto.StatusResponse;
import com.example.demo.service.StatusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {
    private final StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @GetMapping("/check")
    public StatusResponse checkServerStatus(@RequestParam String url) {
        return statusService.checkServerStatus(url);
    }
}