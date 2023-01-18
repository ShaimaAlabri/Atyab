package Project;

import java.util.Arrays;

public class NextGreaterElement {
	public static void main(String[] args) {
//		 For the sixth problem, you would need to provide an array of integers as input to the function that finds the next greater element.
		int[] num= {1,5,6,9,7,10};
		int size=num.length;
		Arrays.sort(num);
		   System.out.println("sorted Array :"+Arrays.toString(num));
		      int res = num[size-2];
		      System.out.println("2nd largest element is ::"+res);
	}
}
