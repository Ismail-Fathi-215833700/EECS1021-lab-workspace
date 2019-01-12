import java.util.Scanner;

public class SimpleUserInput1 {

	public static void main(String[] args) {
		// Create and input objects of type scanner so we can use 
		// the input to read integer, double or string from the keyboard.
		Scanner input = new Scanner(System.in);
		
		/*
		 * Step 1: ask user for input 
		 */
        System.out.println("Enter an integer:");
        
        /*
         * Step 2: input
         */
        int i = input.nextInt(); // read an integer from the user and store it into i.
        
        /*
         * Step 3: compute
         */
        int square = i * i;
        
        /*
         * Step 4: output
         */
        System.out.println("The square of " + i + " is " + square + ".");
        
        input.close();
	}

}
