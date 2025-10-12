package com.example.placement.controller;
import com.example.placement.model.placement;
import com.example.placement.service.PlacementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addplacement")

    public class PcmController {
	@Autowired
    PlacementServices ps;

    @PostMapping
    public placement addPlacement(@RequestBody placement placement) {
        return ps.addPlacement(placement);
    }

    @GetMapping("/retrievaldata")
    public List<placement> getplacements() {
        return ps.getplacements();
    }

    @DeleteMapping("/deletingrecord/{id}")
    public void deletePlacement(@PathVariable Long id) {
        ps.deleteplacement(id);
    }

}
