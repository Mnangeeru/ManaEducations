package com.tech.bahaydruti.vidyalaya.rachana.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.bahaydruti.vidyalaya.rachana.student.entity.VrProfile;

public interface ProfileRepository extends JpaRepository<VrProfile, Long>{
	
	List<VrProfile> findByGender(String gender);
	
	List<VrProfile> findByFirstName(String firstName);
	
	List<VrProfile> findByFirstNameAndLastName(String firstName,String lastName);

}
