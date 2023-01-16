package Project;
//Problem: Given an array of integers and a number k, write a function to determine if there are two distinct elements in the array that add up to k and both elements should be even number.
//Input: [1, 2, 4, 6, 8, 10], k = 10
//Output: true (2 + 8 = 10)
public class AddEvenNum {
	public static void main(String[] args) {
		int array[] = {1, 2, 4, 6, 8, 10};
		int Evensum=0;
		int Evensum1=0;
		int compare=0;
		for(int i = 0; i <6; i++) {
			for(int j = 0; j <6; j++) {
				if(array[i] +array[j]==10) {
					Evensum =  array[j] - array[i]; 
					Evensum1 =  array[j] + array[i];
			if(compare<Evensum) {
				compare = Evensum ; 
			
		System.out.println(array[j]+"," +array[i]);
		System.out.println("EvenSum:"+Evensum1);
		}
		}
			}
			}	
	}
}
