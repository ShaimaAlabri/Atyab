package Project;

public class LargestNumber {
	public static void main(String[] args) {
		int [] number= new int[] {1,2,22,2};
		int maximum=number[0];
		for(int i=1;i<number.length;i++) {
			if(number[i]>maximum) {
				maximum=number[i];
				
			}
		}
		System.out.println("the calling numbers:");
		for(int i=0; i< number.length;i++) {
			System.out.println(number[i]);
			
		}
		System.out.println("Largest Nmber:"+maximum);
	}

}
