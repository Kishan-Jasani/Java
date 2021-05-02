package Java;

//Deque - Double ended queue

import java.util.ArrayDeque;

public class BH_Arraydeque {
	
public static void main(String[] args){
	ArrayDeque a1=new ArrayDeque();
	a1.add(5);
	a1.add(6);
	a1.add(9);
	a1.addFirst(12);
	System.out.println(a1.getFirst());
	System.out.println(a1.getLast());
	}
}

