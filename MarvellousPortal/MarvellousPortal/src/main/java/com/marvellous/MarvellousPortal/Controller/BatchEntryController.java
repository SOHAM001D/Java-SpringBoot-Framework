package com.marvellous.MarvellousPortal.Controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
@RequestMapping("/batches")
// http://localhost:8080/batches
public class BatchEntryController
{
    private HashMap <Long, BatchEntry> batchentries = new HashMap<Long, BatchEntry>();

    @GetMapping
    public ArrayList<BatchEntry> getAll()
    {
        return new ArrayList<>(batchentries.values());
    }

    @PostMapping
    public String createEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(), myentry);
        return "Batch Information gets successfully inserted";
    }

    // http://localhost:8080/batches/id/3
    @DeleteMapping("/id/{myid}")
    public void deleteByid(@PathVariable Long myid)
    {
        batchentries.remove(myid);
    }

    @PutMapping("/id/{myid}")
    public void updateEntry(@PathVariable Long myid, @RequestBody BatchEntry myentry)
    {
        myentry.setId(myid);
        batchentries.put(myid, myentry);
    }
}
