import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int b = scanner.nextInt();

	        // Check if the first number is big or small using the ternary operator
	        String result1 = (a >= b) ? "Big" : "Small";

	        // Check if the second number is big or small using the ternary operator
	        String result2 = (b >= a) ? "Big" : "Small";

	        System.out.println("The first number is " + result1);
	        System.out.println("The second number is " + result2);

	        scanner.close();

		
		
		
		
		
	}

}
