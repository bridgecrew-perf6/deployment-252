package com.gitops.poc.azure.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    private static final String TEST_VARIABLE = "Test Variable";

    @GetMapping("/test")
    public String testApplication() {
        return "Application is working fine";
    }

    public String testMethod() {
        return null;
    }
    
}
