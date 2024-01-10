package com.promineotech.dogrescue.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.dogrescue.controller.model.DogData;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/dog")
@Slf4j
public class DogController {
	
	private org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DogController.class);
	
	/**
	 * GET == read, this will read back a PetStore 
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DogData> createDog(@RequestParam(name = "dogId") Long dogId) {
		log.info("Processing GET Request.");
		DogData dog = new DogData(dogId);
		return ResponseEntity.status(HttpStatus.OK).body(dog);
	}
}
