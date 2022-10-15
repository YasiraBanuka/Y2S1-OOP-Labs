import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Value of the day : ");
		int day = sc.nextInt();
		
		switch(day) {
			case 1: System.out.println("Day of the week : Monday");
			break;
			case 2: System.out.println("Day of the week : Tuesday");
			break;
			case 3: System.out.println("Day of the week : Wednesday");
			break;
			case 4: System.out.println("Day of the week : Thursday");
			break;
			case 5: System.out.println("Day of the week : Friday");
			break;
			case 6: System.out.println("Day of the week : Saturday");
			break;
			case 7: System.out.println("Day of the week : Sunday");
			break;
			default: System.out.println("Invalid day");
		}
		System.out.println("Good bye");
	}
}