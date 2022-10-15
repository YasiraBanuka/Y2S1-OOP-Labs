public class Ex5 {
	
	public static void main(String args[]) {
		
		int r = 0;
		
		while(r < 5) {
			System.out.println("* * * * *");
			r++;
		}
		
		System.out.println("");
		
		for(int i = 0; i < 6; i++) {
			for(int j = 6-i; j > 1; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
}