package Project;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;



public class Profit {
	public static void main(String[] args) {
		ArrayList<Integer> RiceStock =new ArrayList<Integer>();
		RiceStock.add(900);
		RiceStock.add(1200);
		RiceStock.add(1200);
		RiceStock.add(1210);
		RiceStock.add(900);
		RiceStock.add(750);
		RiceStock.add(1050);
	
		ArrayList<Integer> WheatStock =new ArrayList<Integer>();
		WheatStock.add(1100);
		WheatStock.add(1900);
		WheatStock.add(1500);
		WheatStock.add(1500);
		WheatStock.add(1500);
		WheatStock.add(1500);
		WheatStock.add(1400);
		ArrayList<Integer> CottonStock =new ArrayList<Integer>();
		CottonStock.add(200);
		CottonStock.add(700);
		CottonStock.add(300);
		CottonStock.add(290);
		CottonStock.add(600);
		CottonStock.add(750);
		CottonStock.add(350);
		
		ArrayList<Integer> Profit =new ArrayList<Integer>();
		for(int i=0; i<RiceStock.size()-1;i++) {
			System.out.println(RiceStock.get(i)-RiceStock.get(i+1));
			//Integer max = Collections.max(Profit.indexOf(Profit));
//			RiceProfit.add(RiceStock.get(i));
			//  System.out.println("ArrayList max value : " + max );
		}
			ArrayList<Integer> WheateProfit =new ArrayList<Integer>();
			for(int j=0; j<WheatStock.size()-1;j++) {
				System.out.println(WheatStock.get(j)-WheatStock.get(j+1));
//				 Integer max1 = Collections.max(WheateProfit.indexOf(WheateProfit));
//				  System.out.println("ArrayList max value : " + max1);
		}
			ArrayList<Integer>CottonStock1 =new ArrayList<Integer>();
		for(int n=0; n<CottonStock.size()-1;n++) {
				System.out.println(CottonStock.get(n)-CottonStock.get(n+1));
//				Integer max2 = Collections.max(CottonStock1.indexOf(CottonStock1));
//				  System.out.println("ArrayList max value : " + max2);
		}
		
		 
		
		 
	
		//String DayOfWeek = null;
		
	
		//System.out.println(MaximizeAction(DayOfWeek)+Profit.size()+WheateProfit.size()+CottonStock1.size());
		
	}
	
	}


