package com.promineotech.dogrescue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.dogrescue.controller.model.LocationData;
import com.promineotech.dogrescue.services.LocationService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/location")
@Slf4j
public class LocationController {

	@Autowired
	private LocationService locationService;
	private org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LocationController.class);
	
	/**
	 * GET == read, this will read back a PetStore 
	 */
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LocationData> getLocation(@RequestParam(name = "locationId") Long locationId) {
		log.info("Processing GET Request.");
		LocationData data = locationService.findLocById(locationId);
		return ResponseEntity.status(HttpStatus.OK).body(data);
	}
	
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LocationData> createLocation(LocationData locationData) {
		log.info("Processing POST Request.");
		LocationData data = locationService.saveLocation(locationData);
		return ResponseEntity.status(HttpStatus.OK).body(data);
	}
}
