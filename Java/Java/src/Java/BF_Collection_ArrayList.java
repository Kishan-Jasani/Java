package Java;
import java.util.*;
// A collection is a group of object
// Collection in Java is available as form of classes and Interfaces
// present in java.util

//Why do we need collection?
// --> We need collection for efficient storage and better manipulation
// --> resize the array
// --> Insert and delete element
// --> apply certain operations


//ArrayList --> For variable size collection
//Set       --> for distinct value set
//stack     --> LIFO data structures
//Hashmap   --> For Key-Value pair


public class BF_Collection_ArrayList {
	
public static void main(String[] args){
		ArrayList<Integer> l1=new ArrayList();
		ArrayList<Integer> l2=new ArrayList();
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
		l1.set(0,1234);
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println(l1.contains(4));
		l1.clear();
	}
}

