package Java;
import java.util.*;
//LinkedList store 3 things in it... value, reference of next element, reference of previous element
public class BG_Collection_LinkedList {
	
public static void main(String[] args){
	LinkedList<Integer> l1=new LinkedList();
	LinkedList<Integer> l2=new LinkedList();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	l1.add(0,5);
	l1.add(0,6);
	l2.add(12);
	l2.add(15);
	l1.addAll(l2);
	l1.remove(5);
	l1.addLast(12);
	l1.addFirst(13);
	l1.set(0,1234);
	
	for (int i = 0; i < l1.size(); i++) {
		System.out.println(l1.get(i));
	}
	System.out.println(l1.contains(4));
	l1.clear();
	}
}

