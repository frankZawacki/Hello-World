package string1;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "This is String example.";
		char[] myCharArray = myString.toCharArray();
		for(int i = 0; i < myString.length(); i++){
		    // Print each sequential character on the same line
		    System.out.print(myCharArray[i]); 
		}
		// Print a newline
		System.out.println(); 

	}

}

