package com.gitops.poc.azure.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @GetMapping("/test")
    public String testApplication() {
        return "Application is working fine";
    }


   
    
}
