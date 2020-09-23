/*A number is a valid flight number given that it meets the following criteria:
	a. The number is greater than 9 and no greater than 9999.
	b. The number is a jumbled number*.
Please write a function that will provide a list of all valid flight numbers 
that AA can use to number our flights. 
	What is the Big-O for your solution?
*A jumbled number is a number whose digits meet the following criterion: 
*each digit differs by at most 1 from each of its neighboring digits. 
*E.g. 8987 is a jumbled number, but 312 is not.
*/



package helloworld;
import java.util.*;


public class helloworld {

	public static void main(String[] args) {
	
		System.out.println("helloworld");
		ArrayList<Integer> lists= new ArrayList<Integer>();
		int x ,z , l , w , y , m , diff, diff1, diff2;
		for (int i =10;i<10000;i++) 
		{
			if(i<100){
				 x = i%10;
				 y = Math.abs((x*10)-(i-x));
				if(y<11){
					lists.add(i);
				}
			}
			if(i>99){
				 x = i%100;
				 z = x%10;
				 w = i/100;
				 y = x/10;
				 diff = Math.abs(w-y);
				 diff1 = Math.abs(y-z);
				if((diff)<2 && (diff1)<2) {
					lists.add(i);	
				}
			}
			if(i>999){
				 x = i%1000;
				 z = x%100;
				 l = z%10;
				 w = i/1000;
				 y = x/100;
				 m = z/10;
				 diff = Math.abs(w-y);
				 diff1 = Math.abs(y-m);
				 diff2 = Math.abs(m-l);
				if((diff)<2 && (diff1)<2 && (diff2)<2) {
					lists.add(i);			
				}
			}			
		}	
		System.out.println(lists);	
	}
}

			
			/*
			
			char[] chars=String.valueOf(i).toCharArray();
			
				
			if(chars.length==2) {
			int diff= (Character.getNumericValue(chars[chars.length-1])-Character.getNumericValue(chars[chars.length-2]));
			if(Math.abs(diff)<2 ) {
				lists.add(i);
				//System.out.println(i);
			}
			
			}
			if(chars.length==3) {
				int diff= (Character.getNumericValue(chars[chars.length-3])-Character.getNumericValue(chars[chars.length-2]));
				int diff1= (Character.getNumericValue(chars[chars.length-2])-Character.getNumericValue(chars[chars.length-1]));
				if(Math.abs(diff)<2 && Math.abs(diff1)<2) {
					lists.add(i);
					//System.out.println(i%(i-1));
				}
			}
			if(chars.length==4) {
				int diff= (Character.getNumericValue(chars[chars.length-4])-Character.getNumericValue(chars[chars.length-3]));
				int diff1= (Character.getNumericValue(chars[chars.length-3])-Character.getNumericValue(chars[chars.length-2]));
				int diff2= (Character.getNumericValue(chars[chars.length-2])-Character.getNumericValue(chars[chars.length-1]));
				if(Math.abs(diff)<2 && Math.abs(diff1)<2 && Math.abs(diff2)<2) {
					lists.add(i);
					
				}
			}			
			
		*/
			
	
