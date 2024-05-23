package eswarinterviewquestions;

public class Riversestringusingloop {

	public static void main(String[] args) {
		 String input = "example";
	        String reversed = reverseStringUsingLoop(input);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseStringUsingLoop(String input) {
	        StringBuilder reversed = new StringBuilder();

	        // Iterate from the end of the string to the beginning
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }

	        return reversed.toString();
	    }
	}
   

