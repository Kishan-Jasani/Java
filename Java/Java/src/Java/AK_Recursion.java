package Java;

public class AK_Recursion {
	
	//method itself is calling same method is Recursion
	//A function in java can call itself
	public static int factorial(int x) {
		if(x==0 || x==1) {
			return 1;
		}
		else {
			return x*factorial(x-1);
		}
	}
	
	public static void main(String[] args) {
		 System.out.println(factorial(5));
		 System.out.println(factorial(15));
	}
}

