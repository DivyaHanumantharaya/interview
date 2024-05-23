package eswarinterviewquestions;

public class Riverseofstringbystringbuldermethod {
	public static void main(String[] arges) {
		 String input = "example";
	        String reversed = reverseStringUsingStringBuilder(input);
	        System.out.println("Reversed string: " + reversed);
	    }

	    public static String reverseStringUsingStringBuilder(String input) {
	        // Use StringBuilder to reverse the string
	        StringBuilder sb = new StringBuilder(input);
	        return sb.reverse().toString();
	    }
	}


