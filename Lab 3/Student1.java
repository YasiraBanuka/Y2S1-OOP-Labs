public class Student1 extends Person {
	
	private String studentid;
	
	public Student1() {
		this.studentid = null;
	}
	
	public Student1(String studentid) {
		this.studentid = studentid;
	}
	
	public Student1(String name, String address, String studentid) {
		super(name, address);
		this.studentid = studentid;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Stdent ID : " + this.studentid);
	}
	
}