package com.gitops.poc.azure.deployment.controller;

import org.springframework.boot.cloud.CloudFoundryVcapEnvironmentPostProcessor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class ApplicationController {

    private static final String TEST_VARIABLE = "Test Variable";
    private static final String TEST_VARIABLE2 = "Test Variable";
    private static final String TEST_VARIABLE3 = "Test Variable";
    private static final String TEST_VARIABLE4 = "Test Variable";
    private static final String TEST_VARIABLE5 = "Test Variable";
    private static final String TEST_VARIABLE6 = "Test Variable";

    @GetMapping("/")
    public String testApplication() throws IOException {
        return "Application is working fine";
    }

    @GetMapping("/test-get/{name}")
    public String testGet(@PathVariable String name) throws IOException {
        return "Welcome to the site " + name + "!";
    }

    @PostMapping("/test-post")
    public String testPost(@RequestBody String value) throws IOException {
        return "Application is working fine with given input" + value;
    }

    @GetMapping("latest-image")
    public String testLatestImage() {
        return "Latest image deployed";
    }
    
}
