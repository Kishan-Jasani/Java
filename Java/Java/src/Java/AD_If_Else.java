package Java;

public class AD_If_Else {
	public static void main(String[] args) {
		int age = 45;
		if (age>45) {
			System.out.println("You are eligible for vaccination");
		} 
		else if (age==45) {
			System.out.println("Not sure about vaccination");
		}
		else {
			System.out.println("You are not eligible for vaccination");
		}
	}
}

