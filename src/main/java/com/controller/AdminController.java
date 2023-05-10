package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.AdminEntity;
import com.repository.AdminRepository;

@RequestMapping("/admin")
@RestController
public class AdminController {

	@Autowired
	AdminRepository adminRepository;
	
	@PostMapping("/user")
	public ResponseEntity<AdminEntity> addUser(@RequestBody AdminEntity adminEntity)
	{
		adminRepository.save(adminEntity);
		System.out.println(adminEntity.getUserId());
		System.out.println(adminEntity.getEmail());
		return ResponseEntity.ok(adminEntity);
	}
	
	
	@GetMapping("/user")
	public ResponseEntity<List<AdminEntity>> getAllUsers()
	{
		List<AdminEntity> users = adminRepository.findAll();
		
		if(users.isEmpty())
		{
			return ResponseEntity.unprocessableEntity().body(null);
		}
		else
		{
			return ResponseEntity.ok(users);
		}
	}
	
}

