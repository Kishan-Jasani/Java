package Java;

interface Camera{
	void takeSnap();
	default void dflt() {
		prvt();
		System.out.println("Default Method");
	}
	private void prvt() {
		System.out.println("Private");
	}
}

interface Wifi{
	String[] getNetworks();
	void connectToNetworks(String Network);
}

class MyCellPhone{
	public void callNumber() {
		System.out.println("Calling Number");
	}
	public void pickCall() {
		System.out.println("Picking Call");
	}
}

class SmartPhone extends MyCellPhone implements Wifi,Camera{

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
public class AV_InterfacesExample_DefaultMethods {

public static void main(String[] args) {
	SmartPhone sp=new SmartPhone();
	sp.dflt();
//	sp.prvt(); - Throws an error because prvt is private
	String[] ls=sp.getNetworks();
	for (String s : ls) {
		System.out.println(s);
	}
}
}
