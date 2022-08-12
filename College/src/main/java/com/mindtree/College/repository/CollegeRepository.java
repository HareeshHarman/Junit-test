package com.mindtree.College.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.College.entity.*;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

	College findById(long id);
	
}
