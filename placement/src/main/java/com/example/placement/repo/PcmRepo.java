package com.example.placement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.placement.model.placement;

public interface PcmRepo extends JpaRepository<placement,Long>{

	
}
