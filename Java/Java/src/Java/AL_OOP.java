package Java;

class Mobile{
	String name;
	String color;
	int price;
	
	public void printDetails() {
		System.out.println("Your Mobile is "+name+", color is "+color+" and price is "+price);
	}
}
public class AL_OOP {	
	public static void main(String[] args) {
		Mobile oppo= new Mobile();
		oppo.name="Oppo";
		oppo.color="Red";
		oppo.price=15000;
		
		oppo.printDetails();
	}
}

