package eswarinterviewquestions;

import java.util.HashMap;
import java.util.Map;

public class Duplicatevaluesprint {

	public static void main(String[] args) {
		 String input = "example string";
	        printDuplicateCharacters(input);
	    }

	    public static void printDuplicateCharacters(String input) {
	        // Create a HashMap to store character counts
	        Map<Character, Integer> charCountMap = new HashMap<>();
     
	        // Convert the input string to a char array
	        char[] charArray = input.toCharArray();

	        // Count the occurrences of each character
	        for (char c : charArray) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }

	        // Print characters that appear more than once
	        System.out.println("Duplicate characters in the given string:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue());
	            }
	        }
	    }
	}


