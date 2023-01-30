package hackerRank;
import java.util.*;

public class problemSolving {
	
	public static void main(String[] args) {
		
		
		numProgression(2, 4, 3, 1);
	}
	
	public static String numProgression(int v1, int x1, int v2, int x2) {
		
		  if(x1>x2 && v1>v2) {
	            return "NO";
	        }
	        else if(x1<x2 && v1<v2) {
	            return "NO";
	        }
	        if(v1 == v2) {
	            return "NO";
	        }
	        if((x2-x1) %(v1-v2) == 0 || (x2-x1)%(v2-v1) == 0) {
	            return "YES";
	        }
	        else {
	            return "NO";
	        }
		
	}
	
	public static List<Integer> breakingRecords(List<Integer> scores) {
	    // Write your code here
	    int highScore = scores.get(0);
	    int minScore = scores.get(0);
	    int highRecords = 0;
	    int minRecords = 0;
	    
	    for(int i : scores) {
	        if(i > highScore) {
	            highScore = i;
	            highRecords++;
	        }
	        if (i < minScore) {
	            minScore = i;
	            minRecords++;
	        }
	    }
	    
	    List<Integer> records = new ArrayList<Integer>();
	    records.add(highRecords);
	    records.add(minRecords);
	    
	    return records;

	    }  
	

}
