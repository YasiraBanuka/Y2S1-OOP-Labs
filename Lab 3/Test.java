public class Test {
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		s1.setName("Nimal");
		s1.setDit("DIT/11/C1/0010");
		s1.setAddress("Malabe");
		
		Student s2 = new Student();
		s2.setName("Kamal");
		s2.setDit("DIT/11/C1/0314");
		s2.setAddress("Matara");
		
		//System.out.println("Name : " + s1.getName() + "\tDIT : " + s1.getDit() + "\tAddress : " + s1.getAddress());
		//System.out.println("Name : " + s2.getName() + "\tDIT : " + s2.getDit() + "\tAddress : " + s2.getAddress());
		
		s1.getDetails();
		
	}
}