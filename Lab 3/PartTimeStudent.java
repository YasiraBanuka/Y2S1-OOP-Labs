public class PartTimeStudent extends Student1 {
	
	private int noOfWorkHrs;
	
	public PartTimeStudent(String name, String address, String studentid, int noOfWorkHrs) {
		super(name, addrsss);
		super();
		this.noOfWorkHrs = noOfWorkHrs;
	}
	
	public void showDetails() {
		super.showDetails();
		System.out.println("No. of work hours : " + this.noOfWorkHrs);
	}
	
}