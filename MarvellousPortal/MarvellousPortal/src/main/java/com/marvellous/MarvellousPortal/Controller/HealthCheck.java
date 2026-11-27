package com.marvellous.MarvellousPortal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck
{
    @GetMapping("Check")
    public String Check()
    {
        return "Marvellous Portal is live";
    }
    @GetMapping("/")
    public String HomePage()
    {
        return "Welcome to Marvellous Portal";
    }
}
