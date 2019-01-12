
public class NumberVariables {

	public static void main(String[] args) {
		
		          System.out.println("After initializing i's value to 5");
		  int i = 5;      // int (which stands for integer variable type) is the type of variable which requires the user to input a integer, the type is basically the allowable values that could be stored in this variable = 5

                                        // part is known as the initialization, and the previous part is called the declaration
        
                  System.out.println("i's value is: " + i);
                  i = 7; // don't need to declare the type again.
                  System.out.println("After changing i's value to 7");
                  System.out.println("i's value is: " + i);
                  
                double x = 3.5; //23.5
                double y = 4.7; //24.7
                  System.out.println("Average between x and y is: " + ((x + y)/2)); // 5.1
                  // inflexible solution every time x and y above are changed, we have to modify the contents of the string literal below
                  // System.out.println("Average between 23.5 and 24.7 is: " + ((x + y)/2);
                  // below is a flexible solution. as x and y change as their values change.
                  System.out.println("Average between " + x + " and " + y + " is: " + ((x + y)/2));
                  
                  
               
		  
		

	}

}
