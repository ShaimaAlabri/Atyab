package Project;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class NonDuplicate {
	public static void main(String[] args) {
		int[] intArr = new int[] { 0, 0, 1,1, 2,2,3, 3,4, 4 ,5,10};

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (int i = 0; i < intArr.length; i++) {
          
            int temp = intArr[i];
            int count = 0;

            for (int j = 0; j < intArr.length; j++) {
                if (temp == intArr[j]) {
                  
                    count++;
                }
            }
            map.put(temp, count);
        }

        Set<Integer> duplicate = new LinkedHashSet<Integer>();
        Set<Integer> noDuplicate = new LinkedHashSet<Integer>();

        for (int i = 0; i < intArr.length; i++) {


                if (map.get(intArr[i]) > 1) {
                    
                    duplicate.add(intArr[i]);

                } else {
          
                    noDuplicate.add(intArr[i]);
                }
            }
        

        System.out.println("Duplicate Chars : " + Arrays.toString(noDuplicate.toArray( )));
      

    }

}
	


