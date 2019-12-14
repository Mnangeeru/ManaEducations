package com.tech.bahaydruti.vidyalaya.rachana.student.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.bahaydruti.vidyalaya.rachana.student.entity.VrProfile;
import com.tech.bahaydruti.vidyalaya.rachana.student.repository.ProfileRepository;
import com.tech.bahaydruti.vidyalaya.rachana.student.ui.dto.VrProfiledto;

@RestController
@RequestMapping("/student")
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	ProfileRepository repository;
	
	@GetMapping("/profiles")
	public ResponseEntity<List<VrProfile>> getAllProfiles(){
		List<VrProfile> profiles = new ArrayList<>();
		try{
			repository.findAll().forEach(profiles::add);
			if(profiles.isEmpty()){
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(profiles, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/save")
	public ResponseEntity<VrProfile> addStudent(@RequestBody VrProfile profile){
		try{
			profile.setCreate_date(new Date());
			VrProfile _profile = repository.save(profile);
			return new ResponseEntity<>(_profile,HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
		}
	}
	
	@GetMapping("/student/{id}")
	public ResponseEntity<VrProfile> getById(@PathVariable("id") long id){
		Optional<VrProfile> _profile = repository.findById(id);
		if(_profile.isPresent()){
			return new ResponseEntity<>(_profile.get(), HttpStatus.OK);
		}else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<VrProfile>> search(@RequestBody VrProfiledto profiledto){
		try{
			List<VrProfile> _profiles = repository.findByFirstNameAndLastName(profiledto.getFirstName(), profiledto.getLastName());
			if(_profiles.isEmpty()){
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(_profiles, HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
