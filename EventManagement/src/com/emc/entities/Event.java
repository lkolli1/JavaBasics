package com.emc.entities;

public class Event extends EmBase{

	private String description;
	 
	
	public Event(long id, String name, String description ) {
		super();
		 super.setId(id);
		 super.setName(name);
		this.description = description;
		 
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

}
