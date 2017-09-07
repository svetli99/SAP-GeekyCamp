package BullsAndCows;

import java.util.ArrayList;
import java.util.Collections;

public class GenerateNumber {
	
	public static ArrayList<Integer> generateRandom(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> number = new ArrayList<Integer>();
	    for (int i=0; i<10; i++) {
	        list.add(new Integer(i));
	    }
	    Collections.shuffle(list);
	    for(int i=0;i<4;i++){
	    	number.add(list.get(i));
	    }
	    return number;
	    
	}
	
	

}
