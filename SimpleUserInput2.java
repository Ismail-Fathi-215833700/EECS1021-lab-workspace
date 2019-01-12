import java.util.Scanner;

public class SimpleUserInput2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number (which can contain a decimal)");
		double n1 = input.nextDouble();
		input.hasNextLine();
		
		System.out.println("Enter the second number (which can contain a decimal)");
		double n2 = input.nextDouble();
		input.hasNextLine();
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		double average = (n1 + n2) / 2;
		
		System.out.println(name + ", ");
		System.out.println("The number you entered were " + n1 + " and " + n2 + ", and");
		System.out.println("their average is " + average );
		
		input.close();
		
		

	}

}
