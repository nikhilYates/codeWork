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

public class ReverseArray {
	
	public static List<Integer> reverseArray(List<Integer> a) {
	    // Write your code here
		int temp;
		for(int i = 0; i < a.size() / 2; i++) {
			 temp = a.get(i);
			 a.set(i, a.get(a.size() - 1 - i));
			 a.set(a.size()-1-i, temp);	
		}
		return a;
    }
}
