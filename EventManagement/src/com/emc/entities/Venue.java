package com.emc.entities;

public class Venue extends Event{
	 
	public String description;
	public String address;
	
	public Venue(long id, String name, String description, String description2, String address) {
		super(id, name, description);
		description = description2;
		this.address = address;
	}
	 
}
