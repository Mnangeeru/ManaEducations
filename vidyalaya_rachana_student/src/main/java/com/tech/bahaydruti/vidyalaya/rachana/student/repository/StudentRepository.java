package com.tech.bahaydruti.vidyalaya.rachana.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tech.bahaydruti.vidyalaya.rachana.student.entity.VrStudent;

public interface StudentRepository extends JpaRepository<VrStudent, Long>{
	
	List<VrStudent> findByProfileid(long profileid);

}
