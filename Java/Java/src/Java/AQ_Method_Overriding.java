package Java;
//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java
class A{
	public void method1(int a) {
		System.out.println(a);
	}
	
	public void method2() {
		System.out.println("I am method2 of A");
	}
	public void method4() {
		System.out.println("I am method4 of A");
	}
}

class B extends A{
	@Override  //This tag is recommended but not mandatory
	public void method1(int a) {
		System.out.println(a);
	}
	@Override
	public void method2() {
		System.out.println("I am method2 of B");
	}
	
	public void method3() {
		System.out.println("I am method3 of B");
	}
	
	
}
public class AQ_Method_Overriding {

	public static void main(String[] args) {
		A a =new A();
		B b =new B();
		a.method1(5);
		a.method2();
		b.method1(6);
		b.method2();
		b.method2();
		b.method4();
	}
}
