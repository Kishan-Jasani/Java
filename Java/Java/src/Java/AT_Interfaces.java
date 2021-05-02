package Java;
//Interface is a point where two systems met and interact
// In Java, interface is a group of related methods with empty body
//We can create properties in interface, but cannot change because they are final

interface Bicycle{
	int a=45;
	void applyBreak(int decrement);
	void speedUp(int increment);
}

interface Cycle{
	void applyBreak1(int decrement);
	void speedUp1(int increment);
}

//class can implement 2 interfaces, but cannot extends more than 1 abstract class.
class AvonBicycle implements Bicycle,Cycle{
	int speed;
	@Override
	public void applyBreak(int decrement) {
		speed -= decrement;		
	}
	@Override
	public void speedUp(int increment) {
		speed += increment;	
	}
	@Override
	public void applyBreak1(int decrement) {
		speed -= decrement;
	}
	@Override
	public void speedUp1(int increment) {
		speed += increment;
	}
}

public class AT_Interfaces {

	public static void main(String[] args) {
		AvonBicycle ab = new AvonBicycle();
		ab.applyBreak(5);
		System.out.println(ab.a);
//		ab.a = 35;   Throws an error because a is final
	}
}
