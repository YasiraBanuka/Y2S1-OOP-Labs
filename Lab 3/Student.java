public class Student {
	
	private String name;
	private String ditno;
	private String address;
	
	public Student() {
		this.name = null;
		this.ditno = null;
		this.address = null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDit(String ditno) {
		this.ditno = ditno;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDit() {
		return ditno;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void getDetails() {
		System.out.println("I am a Student");
		System.out.println("My name is " + this.name);
		System.out.println("I am from " + this.address);
		System.out.println("My dit no is " + this.ditno);
	}
	
}