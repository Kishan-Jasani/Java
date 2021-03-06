package Java;
//Hashing Technique is used to convert a Key-value pair to Indices

import java.util.HashSet;

/*
--> Let's say we have a one hash function f(x) and one Array arr
--> f(x)=x%10 and arr = {1,13,25,37,9,32,54,56,8,80,23,48,76}
--> Now Hash Value of all the elements present in arr are same as below
--> HashValues = {1,3,5,7,9,2,4,6,8,0,3,8,6}
--> Here we can group values of array according to the hashValue
--> When 2 same HashValues occurs called 'Hash collision'. (Open Addressing, Chaining(LinkedList))
--> The Load factor is a measure that decides when to increase the HashMap capacity.
--> The default load factor of HashMap is 0.75f (75% of the map size).
*/

public class BI_Hashing_HashSet_in_Java {
	
public static void main(String[] args){
	HashSet<Integer> hs = new HashSet(); //It will not entered in order
	hs.add(6);
	hs.add(7);
	hs.add(5);
	hs.add(6);
	System.out.println(hs);
	
	}
}

