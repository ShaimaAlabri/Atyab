package Project;

import java.util.Stack;

public class MiddelElementInStack {

	public static void main(String[] args) {
		//Design a stack in Java that supports push, pop, and get the middle element operations in O(1) time.
Stack<String> names=new Stack<>();
names.push("Ali");
names.push("Dana");
names.push("Ahmed");
names.push("Tamim");
names.push("Aish");
System.out.println("the middel elimeint is :"+ names.get(2));

	}

}
