import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		System.out.println("Enter an integer for seconds:");
		int s = input.nextInt();
		input.nextLine();
		
		double min = (s / 60);
		double sec = (s % 60);
		
		
		System.out.println(name + ", your input " + s + " seconds can be divided into " + min + " minutes and " + sec + " seconds.");
		
		
		input.close();
		

	}

}
