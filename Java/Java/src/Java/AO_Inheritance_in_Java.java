package Java;


class Parent{
	private int x;
	
	public Parent(int x) {
		System.out.println(x);
	}
	
	public Parent() {
		System.out.println("You are in Parent constructor without arg");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}

class Child extends Parent{
	private int y;
	
	public Child(int x) {
		super(x);
		System.out.println("You are in Child Constructor");	
	}
	public Child(int x,int y) {
		super(x);
		System.out.println(y);	
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}

class GrandChild extends Child{

	public GrandChild(int x) {
		super(x);
		
	}
	public GrandChild(int x,int y) {
		super(x);
		
	}
	public GrandChild(int x,int y,int z) {
		super(x,y);
		System.out.println(z);
	}
	
}

public class AO_Inheritance_in_Java {	
	//Inheritance is used to borrow properties & methods from an existing class
	public static void main(String[] args) {
		Parent pr = new Parent(5);
		Child ch = new Child(6);
		System.out.println(ch.getX());
		GrandChild gc = new GrandChild(4,5,6);
	}
}

