package com.anbima.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anbima.dto.StatusDTO;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping
public class HealthController {

	@GetMapping(value = "/health")
	public ResponseEntity<?> health() {
		return ResponseEntity.ok(new StatusDTO("UP"));
	}
	
}
