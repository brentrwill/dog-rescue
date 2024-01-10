package com.promineotech.dogrescue.controller.model;

import java.util.HashSet;
import java.util.Set;

import com.promineotech.dogrescue.entity.Bread;
import com.promineotech.dogrescue.entity.Location;

public class DogData {
	private Long dogId;
	private String name;
	private int age;
	private String color;
	private Location location;
	private Set<Bread> breads = new HashSet<>();

	public DogData(Long id) {
		this.dogId = id;
	}
	
	public Long getDogId() {
		return dogId;
	}

	public void setDogId(Long dogId) {
		this.dogId = dogId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Set<Bread> getBreads() {
		return breads;
	}

	public void setBreads(Set<Bread> breads) {
		this.breads = breads;
	}
}
