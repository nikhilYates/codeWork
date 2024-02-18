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


public class PlusMinus {

	
	public static void pmin(List<Integer> arr) {
		
		NumberFormat formatter = new DecimalFormat("#0.000000");
		
		double positive = 0;
		double zero = 0;
		double negative = 0;
		
		for(int i : arr) {
			
			if(i > 0) {
				
				positive+=1;
			}
			else if(i < 0) {
				
				negative+=1;
			}
			else {
				zero += 1;
			}
			
		}
		
		positive /= arr.size();
		negative /= arr.size();
		zero /= arr.size();
		
		System.out.println(formatter.format(positive));
		System.out.println(formatter.format(negative));
		System.out.println(formatter.format(zero));
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		
	}
}
