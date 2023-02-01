package hackerRank;
import java.util.*;
import java.math.BigInteger;

public class problemSolving {
	
	public static void main(String[] args) {
		
		List<String> str1 = new ArrayList<String>();
		str1.add("ava");
		str1.add("ava");
		str1.add("av");
		str1.add("bb");
		str1.add("corn");
		
		List<String> queryStr = new ArrayList<String>();
		
		queryStr.add("aba");
		queryStr.add("ava");
		queryStr.add("bb");
		queryStr.add("corn");
		
		List<Integer> countStr = new ArrayList<Integer>();
		
		countStr = matchingStrings(str1, queryStr);
		System.out.println(countStr);
		
//		whereDoItFit();
//		numProgression(2, 4, 3, 1);
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
	
	public static void extraLongFactorials(int n) {
	    // Write your code here
	    BigInteger bigFact = BigInteger.ONE;
	    
	    for(int i = n; i > 0; i--) {
	        bigFact = bigFact.multiply(BigInteger.valueOf(i));
	    }
	    System.out.println(bigFact);

	    }
	
	public static void whereDoItFit() {
		
		System.out.println("Enter an integer: ");
		
		Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if(x>=-128 && x<=127)System.out.println("* byte");
	                //Complete the code
	                if(x>=-32768 && x<=32767)System.out.println("* short");
	                if(x>= Math.pow(-2, 32) && x <= Math.pow(2, 32) - 1) System.out.println("* int");
	                if(x>= Math.pow(-2, 64) && x <= Math.pow(2, 64) - 1) System.out.println("* long");
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }
	            

	        }
	}
	
	public static List<Integer> reverseArray(List<Integer> a) {
	    // Write your code here
	        List<Integer> revArr = new ArrayList<Integer>();
	        for(int i = a.size() - 1; i >= 0; i--) {
	            revArr.add(a.get(i));
	        }
	        
	        return revArr;
	    }
	
	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
	    // Write your code here
	    List<Integer> occurences = new ArrayList<Integer>();
	    int count = 0;
	    for(String x : queries) {
	        for(String y : stringList) {
	            if(x == y) {
	                count++;
	            }
	        }
	        occurences.add(count);
	        count = 0;
	    }
	    
	    return occurences;

	    }
	

}
