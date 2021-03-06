package Java;
//throw will use to throw the exception
//throws will use to indicates that this method can throw the exception
//finally block will always execute

class NegativeRadiusException extends Exception{
	public String getMessage() {
		return "radius can not be Negative";
	}
	
	public String toString() {
		return "Negative Radius not Possible";
	}
}

public class BE_Throw_vs_Throws_Finally {
	
	public static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
	
	public static int greet(int a, int b){
		try {
			System.out.println(a/b);
			return a/b;
		} catch (Exception e) {
			System.out.println("b can not be Zero");
		}
		finally {
			System.out.println("Finally");
		}
		return 0;
	}
	
	public static double area(int r) throws NegativeRadiusException{
		if(r<0) {
			throw new NegativeRadiusException();
		}
		double res = Math.PI*r*r;
		return res;
	}
	
public static void main(String[] args){
		try {
			int z = divide(5,0);
			System.out.println(z);
		} catch (Exception e) {
			System.out.println("Exception");
		}
	
//		System.out.println(area(-5));
		
		try {
			System.out.println(area(5));
		}
		catch(NegativeRadiusException a) {
			System.out.println(a.getMessage());
		}
		finally {
			System.out.println("Always Executed");
		}
		
		greet(5,3);  //It will run finally block also even if we return earlier.
		greet(5,0);
	}
}

