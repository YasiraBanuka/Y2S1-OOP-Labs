//import java.io.*  //import all the calsses available in java.io

import java.io.BufferedReader;   // instead of using those 2, can use above mentioned one
import java.io.InputStreamReader;

public class Ex3 {
	public static void main(String args[]) {
		
		int length, width, height;
		float volume;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		System.out.print("Enter length of cube : ");
		length = Integer.parseInt(in.readLine());
		
		System.out.print("Enter width of cube : ");
		width = Integer.parseInt(in.readLine());
		
		System.out.print("Enter height of cube : ");
		height = Integer.parseInt(in.readLine());
		
		volume = length * width * height;
		
		System.out.println("Volume = " + volume);
		
	}
}