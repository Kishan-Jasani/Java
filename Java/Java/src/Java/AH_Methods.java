package Java;

public class AH_Methods {
	//Method is a function written inside class.
	public static int result(int x, int y) {
		return x+y+4;
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=7;
		int res=a+b+4;
		System.out.println(res);
		System.out.println(result(3,7));
		
		int a1=5;
		int b1=9;
		int res1=a1+b1+4;
		System.out.println(res1);
		System.out.println(result(5,9));
		
		AH_Methods Obj = new AH_Methods();
		System.out.println(Obj.result(5, 5));
 	}
}

