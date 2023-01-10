package Project;

import java.util.ArrayList;

public class Merage {
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		arr1.add(9);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(5);
		arr2.add(8);
		arr2.add(10);
		
		ArrayList<Integer> merge =new ArrayList<>();
		for (int i=0; i< arr1.size(); i++) {
			merge.add(arr1.get(i));
		
		}
		for (int i=0; i< arr2.size(); i++) {
			merge.add(arr2.get(i));
		
	}
	merge.sort(null);
	System.out.println(merge);
	}
}
