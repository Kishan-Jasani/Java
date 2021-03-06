package Java;

//--> Three types of errors
//(1) Syntex errors               -   When compiler finds something wrong
//(2) Logical errors              -   when program compiles but does something wrong
//(3) Runtime errors(Exceptions)  -   

//Two types of exceptions in Java 
//(1)Checked   - Compile time exceptions
//(2)Unchecked - Runtime exceptions

//Commonly used exceptions
//(1)Null Pointer Exception
//(2)Arithmetic Exception
//(3)Array out of bound Exception
//(4)Illegal Argument Exception
//(5)Number Format Exception

public class BC_Exception_Handling {

public static void main(String[] args) {
		String[] st = {"a"};
		try {
			System.out.println(st[5]);
			try {
				System.out.println("1000 divided by a is: "+ 1000/0);
			}
			catch(Exception a) {
				System.out.println(a);
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

