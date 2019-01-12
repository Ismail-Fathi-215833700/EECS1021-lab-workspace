
public class SwapTwoStringsCorrect {

	public static void main(String[] args) {
		String person1 = "Alan";
		String person2 = "Tom";
		
		System.out.println("Before the swap: " + "person1 is " + person1 + " and person2 is " + person2 + ".");
		
		
		// Swap
		
		String temp = person1;
		
		person1 = person2;
		person2 = temp;
		
		System.out.println("After the swap: " + "person1 is " + person1 + " and person2 is " + person2 + ".");
		
		
		

	}

}
