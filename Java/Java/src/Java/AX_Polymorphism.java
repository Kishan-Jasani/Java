package Java;
// Polymorphism in Java is a concept by which we can perform a single action in different ways. ... 
// So polymorphism means many forms
// There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism
//Method overloading is an example of static polymorphism, 
//while method overriding is an example of dynamic polymorphism.

interface Camera1{
	void takeSnap();
}

interface Wifi1{
	String[] getNetworks();
	void connectToNetworks(String Network);
}

class MyCellPhone1{
	public void callNumber() {
		System.out.println("Calling Number");
	}
	public void pickCall() {
		System.out.println("Picking Call");
	}
}

class SmartPhone1 extends MyCellPhone1 implements Wifi1,Camera1{
	public void hey() {
		
	}
	@Override
	public void takeSnap() {
		System.out.println("TakingSnap");
	}

	@Override
	public String[] getNetworks() {
		System.out.println("List Of Networks");
		String[] nl = {"Kishan","Redmi","Xiomi"};
		return nl;
	}

	@Override
	public void connectToNetworks(String Network) {
		System.out.println("Network is: "+ Network);
		
	}
	
}

public class AX_Polymorphism {

public static void main(String[] args) {
		//This is a smartPhone but use it as a camera only
		Camera1 cm1=new SmartPhone1();  //Can only use Camera1's functions
		SmartPhone1 sp1=new SmartPhone1(); //Can use all the methods
//		cm1.getNetworks();    	//Not allowed
//		cm1.hey();				//Not allowed
		cm1.takeSnap();
	}
}

