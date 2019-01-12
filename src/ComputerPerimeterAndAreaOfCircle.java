import java.util.Scanner;

public class ComputerPerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius:");
		int r = input.nextInt();
		input.nextLine();
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		double p = (2 * 3.14 * r);
		double a = (3.14 * r * r);
		
		System.out.println(name + ", your input circle with radius " + r + " has perimeter " + p + " and area " + a);
		
		
		input.close();

	}

}
