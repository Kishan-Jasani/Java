package Java;

class One{
	public void name() {
		System.out.println("My name is Java in Class One");
	}
	public void Greet() {
		System.out.println("Good Morning");
	}
}

class Two extends One{
	@Override
	public void name() {
		System.out.println("My name is Java in Class Two");
	}
	public void swagat() {
		System.out.println("Swagatam");
	}
}

public class AR_DynamicMethod_Dispatch {

	public static void main(String[] args) {
		One obj1=new One();
		Two obj2=new Two();
		obj1.name();
		obj2.swagat();
		
		One obj3=new Two();
//		Two obj4=new One();  Not Allowed
		
		obj3.Greet();
		obj3.name();
	}
}
