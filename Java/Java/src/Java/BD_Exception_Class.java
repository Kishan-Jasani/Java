package Java;

class MyException extends Exception{
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
public class BD_Exception_Class {

public static void main(String[] args) {
		int a=5;
		if(a<10) {
			try {
				throw new MyException();
			} catch (MyException e) {
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				e.printStackTrace();
			}
		}
	}
}

