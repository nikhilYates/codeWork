package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HourglassSum {

	
	/**
	 * Goal is to get the largest sum of all the hourglasses in a 6x6 matrix (2D array/list of list of integers)
	 * @param matrix
	 * @return
	 */
	public static int calculateSum(List<List<Integer>> matrix) {
		
		
		List<Integer> maxSum = new ArrayList<>();
		
		/**
		 * We will be tackling this issue by working row by row
		 * getting the sum of each hourglass by row
		 */
		
		for(int i = 0; i < 4; i++) {
			
			
			for(int j = 0; j < 4; j++) {
			
				int hourglassSum = 0;
				/**
				 * for the top row of the hourglass
				 */
				hourglassSum += matrix.get(i).get(j) + matrix.get(i).get(j + 1) + matrix.get(i).get(j+2);
				
				/**
				 * for the middle part of the hourglass
				 */
				hourglassSum += matrix.get(i+1).get(j+1);
				
				/**
				 * for the bottom row of the hourglass
				 */
				hourglassSum += matrix.get(i+2).get(j) + matrix.get(i+2).get(j+1) + matrix.get(i+2).get(j+2); 
				
				maxSum.add(hourglassSum);
			}
			
		}
		
		int max = maxSum.get(0);
		
		for(int p : maxSum) {
			
			if(p > max) {
				
				max = p;
			}
			
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		
		/**
		 * Setup the 6x6 matrix
		 */
		List<List<Integer>> matrix = new ArrayList<>();
		
		int max = 20;
		int min = 0;
		
		for(int i = 0; i < 6; i++) {
			
			List<Integer> row = new ArrayList<>();
			
			for(int j = 0; j < 6; j++) {
				
				row.add((int) Math.floor(Math.random() * (max - min)));
//				row.add(1);
			}
			
			matrix.add(row);
			System.out.println(row);
		}
		
		/**
		 * now call calculateSum to get the sum of all hourglasses in the matrix
		 */
		
		int hgSum = calculateSum(matrix);
		
		System.out.println("Hourglass Sum = " + hgSum);
		
		
	}
	
	
}
