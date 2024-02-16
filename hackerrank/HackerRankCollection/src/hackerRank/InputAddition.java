package hackerRank;


import java.util.*;
import java.io.*;


public class InputAddition {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
        
        int a, b;
        
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        /**
         * Get user input here
         */
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        
        
        /**
         * call helper method
         */
        sum = solveMeFirst(a, b);
        
        
        /**
         * print ans
         */
        System.out.println(sum);
        
        
        
	}
	
	public static int solveMeFirst(int a, int b) {
		
		return a + b;
	}
}
