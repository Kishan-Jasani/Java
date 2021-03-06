package Java;

public class AC_Strings {
	public static void main(String[] args) {
		//String Methods
		String name = "Kishan";
		String city = "       Surat       ";
		String abc = "abcdabcdabcd";
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(city.trim());    //Remove spaces from start and end
		System.out.println(name.substring(3));  //starts from index 3
		System.out.println(name.substring(1, 3)); //starts from index 1 till index 2
		System.out.println(name.replace('h', 'H'));
		System.out.println(name.replace("han", "HAN"));
		System.out.println(name.startsWith("Kis"));
		System.out.println(name.endsWith("an"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('h'));
		System.out.println(name.indexOf("is"));
		System.out.println(abc.indexOf('a', 5));  //Will return -1 if not find anything
		System.out.println(abc.lastIndexOf('a'));
		System.out.println(abc.lastIndexOf("c", 5));
		System.out.println(name.equals("Kishan"));
		System.out.println(name.equalsIgnoreCase("kishAn"));
		System.out.println("double quote \" in it");
		/*
		 \n - New Line
		 \" - Write " in String
		 \t - tab in string
		 \b - backspace
		 */
		
				
		System.out.println("New Line");       //Cursor will go in new line after print
		
		System.out.print("Same Line ");			//Cursor will remain a same line
		
		int a =6;
		float b =5.6f;
		String c = "Heyy";
		System.out.printf("\nValue of a is %d and value of b is %f and value of c is %s", a,b,c);
		
		System.out.format("\nValue of a is %d and value of b is %f and value of c is %s", a,b,c);
			
		
	
	}
}
