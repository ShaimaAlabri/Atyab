package Project;

import java.util.ArrayList;

public class Sum6 {
	public static void main(String[] args) {
		ArrayList<Integer> number=new ArrayList<Integer>();
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(1);
		number.add(7);
		number.add(10);
		for(int i=0;i<number.size();i++) {
			for(int j=i+1;j<number.size();j++) {
			if(number.get(i)+number.get(j)==6) {
				System.out.println("tow  numbers sum of them is 6:"+number.get(i)+"&"+number.get(j));
			}
			}
		}
	}

}
