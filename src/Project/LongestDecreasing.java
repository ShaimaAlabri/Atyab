package Project;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestDecreasing {
//	Problem: Given an array of integers, write a function to find the longest decreasing subarray.
//	Input: [1, 2, 3, 4, 5, 4, 3, 2, 1]
//	Output: [5, 4, 3, 2, 1]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
    	ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1));
    	System.out.println("orignal num:"+arr);
    	
		Set<Integer> set=new LinkedHashSet<>();
		set.addAll(arr);
		arr.clear();
		arr.addAll(set);
		Collections.sort(arr, Collections.reverseOrder());
		System.out.println("number without duplicat"+arr);
		
	

	  
}
}