package Project;

import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UndoRedo {


//	public static void main(String[] args) {
//
//	    static Map<Integer, String> m = new HashMap<>();
//	    static Stack<String> stack = new Stack<>();
//	    static int size = 0;
//
//	    public static void main(String arg[]) {
//
//	        Scanner in = new Scanner(System.in);
////	        System.out.println("Numer of string you need");
//	        
//	        System.out.println("Enter Strings");
//	        String n = in.nextLine();
//	        String x = in.nextLine();
//        
////			for (int i = 0; i <n.length(); i++) {
////				stack.push(n);
////	            size++;
//////	            m.put(i,n);
////        }
////			size = size - 1;
////		for (int i = 0; i <x.length(); i++) {
////				stack.push(x);
////	            size++;
//////	            m.put(i,x);
////        }
////	        size = size - 1;
//	        
//	        
//	        System.out.println("first : " +n);
//	        System.out.println("second : " +x);
//	       
//	 
//	        undo();
//	        undo();
//	        redo();
//	        redo();
//	        stack.push(n);
//	        stack.push(x);
//	    }
//
//	    private static void undo() {
//	        // TODO Auto-generated method stub
//	        removeMy();
//	        System.out.println("undo : " + m);// 2
//	    }
//
//	    private static void redo() {
//	        // TODO Auto-generated method stub
//	        addMy();
//	        System.out.println("redo : " + m);// 3
//	    }
//
//	    public static void addMy() {
//	        String s = stack.pop();
//	        // TODO Auto-generated method stub
////	        size++;
//	        m.put(size, s);
//
//	    }
//
//	    public static void removeMy() {
//
//	        // TODO Auto-generated method stub
//
//	        String str = m.get(size);
//	        m.remove(size);
//	        stack.add(str);
////	        size--;
//
//	    }
//
//	}
//
//    
	
	
	
	
	   static Stack<String> stack1 = new Stack<>(); // your current data
	    static Stack<String> stack2 = new Stack<>(); // contains strings that you "undo"

	    public static void main(String arg[])
	    {
	        Scanner in = new Scanner(System.in);
	        while(true)
	        {
	            System.out.println("press 1:enter new  2:undo  3:redo");
	            switch(in.nextInt())
	            {
	                case 1:
	                System.out.println("enter it:");
	                stack1.push(in.next());
	                break;

	                case 2:
	                stack2.push(stack1.pop());
	                break;

	                case 3:
	                stack1.push(stack2.pop());
	                break;
	            }
	          
//	            StringBuffer str = new StringBuffer();
//	            str.append(stack1);

	            System.out.println("current data:" +Arrays.toString(stack1.toArray()).replace("[", "").replace("]", "").replace(",", " "));
	            System.out.println("data for redo:" +Arrays.toString( stack2.toArray()).replace("[", "").replace("]", "").replace(",", " "));
	          
	        }
	    }
}

