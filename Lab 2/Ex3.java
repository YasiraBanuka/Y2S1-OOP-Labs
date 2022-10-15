import java.util.Scanner;

public class Ex3 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter lenght : ");
		float length = sc.nextFloat();
		
		System.out.print("Enter width : ");
		float width = sc.nextFloat();
		
		System.out.print("Enter height : ");
		float height = sc.nextFloat();
		
		float volume = length * width * height;
		
		System.out.println("Volume = " + volume);
		
	}
}