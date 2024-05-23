package eswarinterviewquestions;

import java.util.HashSet;
import java.util.Set;

public class Uniquevalueswitheven {
	
		 public static void main(String[] args) {
		        String input = "example string";
		        String result = findUniqueEvenIndexCharacters(input);
		        System.out.println("Unique characters at even indexes: " + result);
		    }

		    public static String findUniqueEvenIndexCharacters(String input) {
		        Set<Character> uniqueChars = new HashSet<>();

		              // Iterate through the string, checking characters at even indexes
		        for (int i = 0; i < input.length(); i += 2) {
		            uniqueChars.add(input.charAt(i));
		        }

		        // Convert the set of unique characters to a string
		        StringBuilder result = new StringBuilder();
		        for (char c : uniqueChars) {
		            result.append(c);
		        }

		        return result.toString();
		    }
	}


