package com.gitops.poc.azure.deployment.controller;

import org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    private static final String TEST_VARIABLE = "Test Variable";
    private static final String TEST_VARIABLE2 = "Test Variable";
    private static final String TEST_VARIABLE3 = "Test Variable";
    private static final String TEST_VARIABLE4 = "Test Variable";
    private static final String TEST_VARIABLE5 = "Test Variable";
    private static final String TEST_VARIABLE6 = "Test Variable";

    @GetMapping("/test")
    public String testApplication() {
        return "Application is working fine";
    }

    public String testMethod() throws IOException {
        return null;
    }
    
}
