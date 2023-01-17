package Project;

import java.util.Arrays;
import java.util.Stack;

public class SecoundLargestStack {

	public static int main(int[] arr) {
		// Given a list of integers, implement a stack in Java that can return the second largest element in O(1) time.
//       Stack<Integer> num = new Stack<>();
//       num.push(1);
//       num.push(5);
//       num.push(9);
//       num.push(10);
      Stack<Integer> stack = new Stack<>();
      int max=Integer.MIN_VALUE;
      int secondMax=Integer.MIN_VALUE;
      
      for(int i=0; i<arr.length;i++){
    	  if(arr[i]>max) {
    		  secondMax=max;
    		  max=arr[i];
    		  
    	  }else if(arr[i]>secondMax && arr[i]<max) {
    			  secondMax=arr[i];
    			  
    		  }
    		 
    	  }
    	  return secondMax;
      }
      public static void main(String[] args) {
    	  int[] arr= {1,2,8,9,20,50};
    	  System.out.println("second largest num:");
    	  System.out.println(main(arr));
      }
	

}
