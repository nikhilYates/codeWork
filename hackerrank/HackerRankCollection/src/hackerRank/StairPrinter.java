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


public class StairPrinter {

	public static void printStair(int n) {
		
		char[] lineString = new char[n];
		
		for(int k = 0; k < lineString.length; k++) {
			lineString[k] = ' ';
		}
		
		for(int i = 0; i < n; i++) {
			
			lineString[n-1-i] = '#';
			System.out.println(lineString);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int n = 5;
		printStair(n);
	}
	
}
