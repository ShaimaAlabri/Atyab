package Project;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// Create a function in Java that checks whether a given string is a palindrome using a stack
		System.out.println("Enter to Test");
		Scanner in=new Scanner(System.in);
		String test=in.nextLine();
		Stack stack=new Stack();
		
		for(int i=0; i<test.length();i++) {
			stack.push(test.charAt(i));
			
		}
		String reverseString="";
		while(!stack.isEmpty()) {
			reverseString=reverseString+stack.pop();
			
		}
		if(test.equals(reverseString)) {
			System.out.println("the input is palindrome");
		}else {
			
			System.out.println("the input is not palindrome");
		}
}

}
