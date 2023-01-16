package Project;

import java.util.Arrays;

public class ThirdHighstNum {
//	Problem: Given an array of integers, write a function that finds the third highest number in the array.
//	Input: [1, 5, 9, 3, 7, 8, 2, 4, 6]
//	Output: 7
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 5, 9, 3, 7, 8, 2, 4, 6};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-3];
	      System.out.println("3nd largest element is ::"+res);
	}

}
