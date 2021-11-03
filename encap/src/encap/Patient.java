package encap;

public class Patient {
	private int id;
	private String Name;
	private String ssn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", Name=" + Name + ", ssn=" + ssn + "]";
	}
	

}
