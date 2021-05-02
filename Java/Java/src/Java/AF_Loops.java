package Java;

import java.util.Iterator;

public class AF_Loops {
	public static void main(String[] args) {
		//While Loop
		int i=1;
		while (i<=3) {
			System.out.println(i);
			i++;
		}
		
		//do While loop
		int j=10;
		do {
			System.out.println("j is: "+j);
			j--;
		}
		while(j>=7);
		
		//For Loop
		for (int k = 0; k < 10; k++) {
			System.out.println(k);
		}
		
		//print first 10 even numbers
		for (int i1 = 0; i1 <= 20; i1=i1+2) {
			System.out.println(i1);
		}
		
		
		//Break - It will break the entire loop
		for (int j2 = 0; j2 < 10; j2++) {
			System.out.println("number is: "+ j2);
			if(j2==3) {
				break;
			}
			
		}
		//Continue - It will skip the current iteration
		for (int j2 = 0; j2 < 10; j2++) {
			if(j2==3) {
				continue;
			}
			System.out.println("Number is: "+ j2);
		}
		
	}
}

