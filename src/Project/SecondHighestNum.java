package Project;

import java.util.Arrays;

public class SecondHighestNum {
	public static void main(String[] args) {
	    int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      Arrays.sort(array);
	      System.out.println("sorted Array ::"+Arrays.toString(array));
	      int res = array[size-2];
	      System.out.println("2nd largest element is ::"+res);
	   }
	}
