package Java;

class MyEmp{
	//A constructor in Java is a special method that is used to initialize objects. 
	//The constructor is called when an object of a class is created.
	public MyEmp() {
		id =45;
		name="default";
	}
	//Constructor overloading
	public MyEmp(String nm, int Id) {
		id =Id;
		name=nm;
	}
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class AN_Constructors_in_Java {	
	
	public static void main(String[] args) {
		MyEmp e1 = new MyEmp("Yes",400);
		e1.setName("Kishan");
		System.out.println(e1.getName());
	}
}

