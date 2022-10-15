public class InheritanceDemo {
	
	public static void main(String args[]) {
		
		Person p1 = new Person("Nirmal", "Nugegoda");
		p1.showDetails();
		
		System.out.println("=======================================");
		
		Student1 ob = new Student1("Chala", "Colombo", "IT21378");
		ob.showDetails();
		
		System.out.println("=======================================");
		
		PartTimeStudent pt = new PartTimeStudent("Yasira", "Galle", "IT21378", 20);
		pt.showDetails();
		
	}
	
}