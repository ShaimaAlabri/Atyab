package Project;

import java.util.Stack;

public class PushPopstack {
//	Implement a stack data structure in Java using an array, with push and pop operations.
	public static void main(String[] args) {
	Stack<String> Transport= new Stack<>();
	 Transport.push("Car");
	 Transport.push("Mitro");
	 Transport.push("Airplane");
	 Transport.push("Ship");
	 System.out.println("Transport type"+Transport);
	 Transport.pop();
	 Transport.pop();
	 System.out.println("Updeat"+Transport);
	}
}
