package eswarinterviewquestions;

public class Printpiramidvalue {

	public static void main(String[] args) {
		 int n = 5; // Number of levels in the pyramid

	        // Outer loop for each level
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces for alignment
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }

	            // Print numbers in ascending order up to the current level
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k + " ");
	            }

	            // Move to the next line after each level
	            System.out.println();
	        }
	    
	}
  
}
