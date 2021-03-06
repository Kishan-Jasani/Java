package Java;
//Annotations used to provide extra informations(metadata) to class/method

//@Override  - to override something from parent class
//@SuppressWarnings("Deprecated")  -- to ignore the warnings
//@Deprecated  --  to deprecate something
//@FunctionalInterface  -- Functional Interface can have only one abstract method

@FunctionalInterface
interface MyInt{
	void thisMethod();
}

public class BL_Annotations_in_Java {
	@Deprecated
	static int sum(int a,int b) {
		return a+b;
	}
	@SuppressWarnings("deprecation")
public static void main(String[] args){
	
	System.out.println(sum(5,6));
	
}
}

