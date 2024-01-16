package reversedString;

public class reversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String I = "Hello World!";
	
	// Create a StringBuilder
	StringBuilder reversed = new StringBuilder(); 
// String Builder allows you to modify the content of the sequence with out creating a new object each time.
	
	
	// use a while loop to iterate through the original string in reverse order 
	int i = I.length()-1; // initialize A as int and I.length()-1 to point to last charecter of the string
	while(i >= 0) { // continue as long as i>=0
		// append each character to the StringBuilder
		reversed.append(I.charAt(i)); // append i in the stringbuilder named reversed
		i--; // decremented by 1 moving through loop 
	}
	
	// convert StringBuilder back to string
	String result = reversed.toString();
	
    System.out.println("Original: " + I);
    System.out.println("Reversed: " + result);
 }
}
