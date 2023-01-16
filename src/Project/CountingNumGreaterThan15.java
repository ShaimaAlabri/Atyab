package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;



public class CountingNumGreaterThan15 {

	public static void main(String[] args) {
//		Problem: Given an array of integers, write a function to find the number of times a given integer value appears in the array where the value is greater than 10.
//		Input: [1, 2, 15, 20, 15, 30, 20, 15, 15], val = 15
//		Output: 4
		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1, 2, 15, 20, 15, 30, 20, 15, 15));
		Set<Integer> set=new LinkedHashSet<>();
		for(Integer val :arr) {
			if(val.intValue()>10) {
			set.add(val);
				
			}
		}
	System.out.println(arr);
	System.out.println(set.size());

	}

}
