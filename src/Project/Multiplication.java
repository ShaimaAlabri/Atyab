package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Multiplication {
//	Problem: Given an array of integers, write a function that finds the maximum product that can be formed by multiplying any four integers.
//	Input: [1, 2, 3, 4, 5, 6]
//	Output: 120 (6 * 5 * 4 * 3)

	public static Integer[] num= {3,1,2,4,5,6};
	public static void main(String[] args) {
	
		Arrays.sort(num, Comparator.reverseOrder());
		int total=1;
		for(int i=0;i<4;i++){
			total*=num[i];
		}
	
		
		System.out.println(total);
	          
	}
}
