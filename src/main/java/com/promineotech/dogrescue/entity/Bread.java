package com.promineotech.dogrescue.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Bread {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long breadId;
	private String name;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@ManyToMany(mappedBy = "breads")
	private Set<Dog> dogs = new HashSet<Dog>();

	public Long getBreadId() {
		return breadId;
	}

	public void setBreadId(Long breadId) {
		this.breadId = breadId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Dog> getDogs() {
		return dogs;
	}

	public void setDogs(Set<Dog> dogs) {
		this.dogs = dogs;
	}
}
