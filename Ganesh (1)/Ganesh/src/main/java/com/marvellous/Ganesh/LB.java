package com.marvellous.Ganesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LB
{
    @GetMapping("LBBatch")
    public String DisplayLB()
    {
        return "LB is programming oriented Batch";
    }
}
