public class Demo {
	
	public static void main(String args[]) {
		
		EvenOddNumber obj = new EvenOddNumber();
		
		boolean result = obj.findEvenOrOdd(7);
		
		if(result == true) {
			System.out.println("This is an even number");
		}
		else {
			System.out.println("This is an odd number");
		}
		
	}
	
	
}