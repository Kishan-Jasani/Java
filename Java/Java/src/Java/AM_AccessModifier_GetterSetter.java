package Java;

class Employee{
	int id;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class AM_AccessModifier_GetterSetter {	
	//Access Modifier:-
	//Private - Not directly accessible in other class
	//Public - accessible everywhere
	//Default
	//Protected
	
	public static void main(String[] args) {
		Employee em1 = new Employee();
		em1.id=9025;
//		em1.name="Kishan";    --It will throw an error, because name is private
		em1.setName("Kishan");
		System.out.println(em1.id);
		System.out.println(em1.getName());
		
	}
}

