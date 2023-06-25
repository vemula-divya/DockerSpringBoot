package com.springboot.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.docker.entity.DemoEntity;
import com.springboot.docker.repository.DemoRepo;

@RestController
public class DockerController {
	@Autowired
	DemoRepo demorepo;
	
	@GetMapping("testAPI")
	public String testMethod() {
		return "HI Docker";
	}
	
	
	
	@GetMapping(path="/all")
	public ResponseEntity<List<DemoEntity>> getAll()
	{
		List<DemoEntity> res=demorepo.findAll();
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	
	@PostMapping(path="/add")
	public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity entity)
	{
		DemoEntity res=demorepo.save(entity);
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
	
	

}
