package BullsAndCows;

import java.util.ArrayList;

public class CheckBullsAndCows {
	public static boolean check(ArrayList<Integer> number,String assum){
		int brCows=0;
		int brBulls=0;
		for(int i=0;i<assum.length();i++){
			for(int k=0;k<number.size();k++){
				if(assum.charAt(i)-'0'==(number.get(k))){
					if(i!=k){
						brCows++;
					}else brBulls++;
				}
			}
		}
		
		
		System.out.println("Cows=" + brCows);
		System.out.println("Bulls=" + brBulls);
		
		return (brBulls==4);
		
	}

}
