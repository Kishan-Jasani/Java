package Java;

public class AI_MethodOverloading {
	//A static method belongs to the class rather than the object of a class. 
	//A static method can be invoked without the need for creating an instance of a class. 
	//A static method can access static data member and can change the value of it. 
	//A static method can call without creating object within the class
	
	public static int sum(int p, int q) {
		return p+q;
	}
	
	public static int sum(int p, int q, int r) {
		return p+q+r;
	}
	
	public static int sum(int p, int q, int r, int s) {
		return p+q+r+s;
	}
	
	public static void change(int a) {
		a = 98;
	}
	public static void change(int[] arr) {
		arr[0] = 98;
	}
	
	public static void main(String[] args) {
		//We have 3 methods with same name (sum) with different parameters, This is called method overloading
		//We also have 2 methods with same name(change) with different parameters, This is called method overloading
		int x=5;
		change(x);
		System.out.println(x); //It will not change the value of variable x, because just copy will go inside method
		
		int[] arr = {5,6,7,8,9,10};
		change(arr);
		System.out.println(arr[0]); //It will change the value of variable arr[0], because reference will go in method
		
		//Method Overloading
		sum(2,3);
		sum(2,3,4);
		sum(2,3,4,5);
		
	}
}

