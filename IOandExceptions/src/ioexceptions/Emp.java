package ioexceptions;

import java.io.Serializable;

public class Emp implements Serializable {
	private int id;
	private String name;
	private String ssn;
	
	public Emp(int id, String name, String ssn) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", ssn=" + ssn + "]";
	}
	

}
