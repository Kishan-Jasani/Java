package Java;

public class AE_SwitchCase {
	public static void main(String[] args) {
		int age = 45;
		switch(age){
			case 18:
				System.out.println("You are now eligible for voting");
				break;  // break is mandatory, otherwise it will print everything after match condition
			case 45:
				System.out.println("You are now eligibe for vaccination");
				break;
			case 60:
				System.out.println("Don't go out");
				break;
			default:
				System.out.println("Enjoy");
		}
		
		String city = "Bhopal";
		switch(city){
			case "Surat" -> System.out.println("You are Surti");
			case "Bhopal" -> System.out.println("You are Bhopali");
			case "Botad" -> System.out.println("You are Botadi");
			default -> System.out.println("You don't have city");
		}
	}
}

