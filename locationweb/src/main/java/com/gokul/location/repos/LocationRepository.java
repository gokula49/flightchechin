package com.gokul.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokul.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location , Integer> {
	
	

	
}
