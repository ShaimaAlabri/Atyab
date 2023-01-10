package Project;

import java.util.Scanner;

public class LimitNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("first number:");
			int num1=sc.nextInt();
			System.out.println("secound number:");
			int num2=sc.nextInt();
			if(num1>=0 && num1<=100 && num2>=0 && num2<=100) {
				break;
			}
			else {
				
				System.out.println("number out of the range plese try again!");
				
			}
		}
	
		
	}
}
