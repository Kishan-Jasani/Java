package Java;
//A lambda expression is a short block of code which takes in parameters and returns a value. 
//Lambda expressions are similar to methods, 
//but they do not need a name and they can be implemented right in the body of a method.
//It can be implemented of Functional Interfaces(only one method will be there)

interface Int1{
	void disp();
}
interface Int2{
	void sum(int a,int b);
}

public class BN_Lambda_expression {
	
public static void main(String[] args){
	//Using Lambda Function
	Int1 obj = ()->{System.out.println("This is disp method of Int1 Interface using Lambda");};
	obj.disp();
	
	
	Int2 obj1 = (a,b)->{System.out.println(a+b);};
	obj1.sum(4,5);
}
}

