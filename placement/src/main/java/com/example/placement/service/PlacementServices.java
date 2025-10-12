package com.example.placement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.placement.model.placement;
import com.example.placement.repo.PcmRepo;

@Service

public class PlacementServices {

	    @Autowired
	    PcmRepo ps;

	    // Insert
	    public placement addPlacement(placement placement) {
	        return ps.save(placement);
	    }

	    // Select
	    public List<placement> getplacements() {
	        return ps.findAll();
	    }

	    // Delete
	    public void deleteplacement(Long id) {
	    	 ps.deleteById(id);
	    }

}
