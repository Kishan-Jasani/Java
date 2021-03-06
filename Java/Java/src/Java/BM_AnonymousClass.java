package Java;
//In Java, a class can contain another class known as nested class. 
//It's possible to create a nested class without giving any name. 
//A nested class that doesn't have any name is known as an anonymous class. 
//Anonymous classes usually extend subclasses or implement interfaces.

interface Int {
	void meth1();
	void meth2();
}

class Anonymous{
	void display() {
		System.out.println("Display");
	}
}

public class BM_AnonymousClass {
	
public static void main(String[] args){
	//Here we are creating new class implementing interface without giving any name
	Int obj = new Int() {
		@Override
		public void meth1() {
			System.out.println("meth1");		
		}
		@Override
		public void meth2() {
			System.out.println("meth2");		
		}
	};
	
	obj.meth1();
	obj.meth2();
	
	//Here we are creating new class extending class without giving any name
	Anonymous obj1 = new Anonymous() {
		public void display() {
			System.out.println("Display as anonymous");		
		}
	};
	obj1.display();
}
}

