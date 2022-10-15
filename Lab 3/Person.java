public class Person {
	
	private String name;
	private String address;
	
	public Person() {
		this.name = null;
		this.address = null;
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public void showDetails() {
		System.out.println("Name : " + this.name + "\tAddress : " + this.address);
	}
	
}