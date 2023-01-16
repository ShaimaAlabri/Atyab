package Project;

import java.text.CollationElementIterator;
import java.text.Collator;
import java.text.CompactNumberFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//import javax.script.Compilable;
//import javax.swing.RowFilter.ComparisonType;



public class Profit {
	public static void main(String[] args) {
		ArrayList<Integer> RiceStock =new ArrayList<Integer>(List.of(900,1200,1200,1210,900,750,1050));
//		RiceStock.add(900);
//		RiceStock.add(1200);
//		RiceStock.add(1200);
//		RiceStock.add(1210);
//		RiceStock.add(900);
//		RiceStock.add(750);
//		RiceStock.add(1050);
//	
		ArrayList<Integer> WheatStock =new ArrayList<Integer>(List.of(1100,1900,1500,1500,1500,1500,1400));
//		WheatStock.add(1100);
//		WheatStock.add(1900);
//		WheatStock.add(1500);
//		WheatStock.add(1500);
//		WheatStock.add(1500);
//		WheatStock.add(1500);
//		WheatStock.add(1400);
		ArrayList<Integer> CottonStock =new ArrayList<Integer>(List.of(200,700,300,290,600,750,350));
//		CottonStock.add(200);
//		CottonStock.add(700);
//		CottonStock.add(300);
//		CottonStock.add(290);
//		CottonStock.add(600);
//		CottonStock.add(750);
//		CottonStock.add(350);
		
		ArrayList<Integer> Profit =new ArrayList<Integer>();
		for(int i=0; i<RiceStock.size()-1;i++) {
			System.out.println(RiceStock.get(i)-RiceStock.get(i+1));
			Profit.add(RiceStock.get(i)-RiceStock.get(i+1));

			//Integer max = Collections.max(Profit.indexOf(Profit));
//			RiceProfit.add(RiceStock.get(i));
			//  System.out.println("ArrayList max value : " + max );
		}
			ArrayList<Integer> WheateProfit =new ArrayList<Integer>();
			for(int j=0; j<WheatStock.size()-1;j++) {
				System.out.println(WheatStock.get(j)-WheatStock.get(j+1));
				WheateProfit.add(WheatStock.get(j)-WheatStock.get(j+1));
//				 Integer max1 = Collections.max(WheateProfit.indexOf(WheateProfit));
//				  System.out.println("ArrayList max value : " + max1);
		}
			ArrayList<Integer>CottonStock1 =new ArrayList<Integer>();
		for(int n=0; n<CottonStock.size()-1;n++) {
				System.out.println(CottonStock.get(n)-CottonStock.get(n+1));
				CottonStock1.add(CottonStock.get(n)-CottonStock.get(n+1));
				
//				Integer max2 = Collections.max(CottonStock1.indexOf(CottonStock1));
//				  System.out.println("ArrayList max value : " + max2);
		}
		System.out.println(Profit);
		System.out.println(WheateProfit);
		System.out.println(CottonStock1);
		
		 System.out.println("Maximum RiceStock profit: " + Collections.min( Profit));
		 System.out.println("Maximum WheatStock profit : " + Collections.min(WheateProfit));
		 System.out.println("Maximum CottonStock profit : " + Collections.min(CottonStock1));
		
		 System.out.println("Maximum  profit in Sunday : "  + Math.min(Math.min(Profit.get(0),WheateProfit.get(0)),CottonStock1.get(0)));
		 System.out.println("Maximum  profit in Monday : "  + Math.min(Math.min(Profit.get(1),WheateProfit.get(1)),CottonStock1.get(1)));
		 System.out.println("Maximum  profit in Tuesday: "  + Math.min(Math.min(Profit.get(2),WheateProfit.get(2)),CottonStock1.get(2)));
		 System.out.println("Maximum  profit in Wedneday : "  + Math.min(Math.min(Profit.get(3),WheateProfit.get(3)),CottonStock1.get(3)));
		 System.out.println("Maximum  profit in Thuesday: "  + Math.min(Math.min(Profit.get(4),WheateProfit.get(4)),CottonStock1.get(4)));
		 System.out.println("Maximum  profit in Friday : "  + Math.min(Math.min(Profit.get(5),WheateProfit.get(5)),CottonStock1.get(5)));
		
	}
	
	}


