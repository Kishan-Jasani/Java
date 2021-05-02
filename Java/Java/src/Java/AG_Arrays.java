package Java;

import java.awt.List;
import java.util.ArrayList;

public class AG_Arrays {
	public static void main(String[] args) {
		//Array is a collection of similar type of data.
		int[] marks = new int[5];
		marks[0]=60;
		marks[1]=60;
		marks[2]=60;
		marks[3]=60;
		marks[4]=60;
//		marks[5]=60;  - Throws an error
		System.out.println(marks[4]);
		
		String[] name = {"abc","pqr","xyz"};
//		name[3] = "frt"; - Throws an error
		System.out.println(name[2]);
		
		System.out.println(marks.length);
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		for (int k : marks) {
			System.out.println(k);
		}
		
		
		//2-D Multi-dimensional array
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(arr[1][1]);
		
		for (int[] is : arr) {
			for (int is2 : is) {
				System.out.print(is2);
			}
			System.out.print("\n");
		}
		
 	}
}

