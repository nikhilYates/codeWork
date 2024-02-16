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


public class DiagonalDifference {

	
	
	
	
	public static int diagDiff(List<List<Integer>> ma) {
		
		
		
		int sumMain = 0;
		int sumOpp = 0;
		
		for(int i = 0; i < ma.size(); i++) {
			
			sumMain += ma.get(i).get(i);
			System.out.println("Sum Main at i = " + i + " is " + sumMain);
			
			sumOpp += ma.get(i).get(ma.size() - 1 - i);
			System.out.println("Sum Opp at i = " + i + " is " + sumOpp);
		}
		
		
		return Math.abs(sumMain - sumOpp);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		List<List<Integer>> matrix = new ArrayList<>();
		
		int max = 25;
		int min = 0;
		
		List<Integer> row1 = new ArrayList<>();
		List<Integer> row2 = new ArrayList<>();
		List<Integer> row3 = new ArrayList<>();
		List<Integer> row4 = new ArrayList<>();
		
		for(int i = 0; i < 4; i++) {
			
			row1.add((int)Math.floor(Math.random() * (max - min) + 1));
			row2.add((int)Math.floor(Math.random() * (max - min) + 1));
			row3.add((int)Math.floor(Math.random() * (max - min) + 1));
			row4.add((int)Math.floor(Math.random() * (max - min) + 1));
			
		}
		
		matrix.add(row1);
		matrix.add(row2);
		matrix.add(row3);
		matrix.add(row4);
		
		
		for(int j = 0; j < matrix.size(); j++) {
			System.out.println(matrix.get(j));
		}
		
		int difference = diagDiff(matrix);
		
		System.out.println("The difference is: " + difference);
		
	}
}
