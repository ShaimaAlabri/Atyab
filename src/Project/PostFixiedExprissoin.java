package Project;

import java.util.Scanner;
import java.util.Stack;



public class PostFixiedExprissoin {

	public static void main(String[] args) {
		//Create a function in Java that evaluates a postfix expression using a stack.
//	static int evalPf(String str)
//	{
		Stack <String> post= new Stack<>();
		post.push("-");
		post.push("+");
		post.push("/");
		post.push("*");
		post.push("()");
		
		System.out.println(post);
		System.out.println("the 1 highst power:"+post.pop());
		System.out.println("the 2 highst power:"+post.pop());
		System.out.println("the 3 highst power:"+post.pop());
		System.out.println("the 4 highst power:"+post.pop());
		System.out.println("the 5 highst power:"+post.pop());
	}
}
