package Java;

//Parent's abstract Methods must be there in all Child classes which is not abstract class.
//Abstract Class's Object can not be created
//If class includes abstract method Class itself will be abstract

abstract class Parent1{
	public Parent1() {
		System.out.println("Parent1 Constructor");
	}
	public void sayHello() {
		System.out.println("Hello");
	}
	abstract public void greet();
	abstract public void greet1();
}

class Child1 extends Parent1{
	//It is compulsory to implement parent's Abstract methods if this class is not abstract
	@Override
	public void greet() {	
	}

	@Override
	public void greet1() {
		
	}
	
}

abstract class Child2 extends Parent1{
	//if Child2 is abstract class, no need to implement Parent's abstract methods
}

public class AS_AbstractClass_AbstractMethod {
	//Abstract means existing in through or as an idea without  concrete existance.
	public static void main(String[] args) {
//		Parent1 p1=new Parent1();  //Can not be possible to create object of abstract class
//		Child2 c2=new Child2();		//Can not be possible to create object of abstract class
		Parent1 c1=new Child1();		//Can be possible
		Child1 c2=new Child1();		//Can be possible
	}
}
