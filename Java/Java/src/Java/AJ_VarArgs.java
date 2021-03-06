package Java;

public class AJ_VarArgs {
	public static int sum(int ...arr) {
		// Available as int[] arr
		int s=0;
		for (int i : arr) {
			s+=i;
		}
		return s;
	}
	
	//At least 2 integer is required in this method
	public static int sum1(int x, int y, int ...arr) {
		// Available as int[] arr
		int s=x+y;
		for (int i : arr) {
			s+=i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		 System.out.println(sum(2,3));
		 System.out.println(sum(2,3,4));
		 System.out.println(sum(2,3,4,5));
		 System.out.println(sum(2,3,4,5,6));
		 
		 System.out.println(sum1(2,5));
		 System.out.println(sum1(2,3,4));
		 System.out.println(sum1(2,3,4,5));
	}
}

