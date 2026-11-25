package com.marvellous.withoutDependency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    //Composition
    public HardDisk hobj;
    public RAM robj;

    public Laptop()
    {
        this.hobj = new HardDisk();
        this.robj = new RAM();
    }

    @GetMapping("GetLaptop")
    public String GetLaptop()
    {
        return "Laptop contains " + hobj.GetHardDisk() + " and " + robj.GetRAM();
    }
}
