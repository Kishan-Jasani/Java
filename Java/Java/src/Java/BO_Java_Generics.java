package Java;
//Java Generics is a set of related methods or a set of similar types. 
//Generics allow types Integer, String, or even user-defined types to be passed as a parameter to classes, methods, or interfaces. 
//Generics are mostly used by classes like HashSet or HashMap.

class MyGeneric<T1,T2>{
	int val;
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	private T1 t1;
	private T2 t2;
	public MyGeneric(int val, T1 t1,T2 t2) {
		this.val = val;
		this.t1 = t1;
		this.t2 = t2;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	
}
public class BO_Java_Generics {
	
public static void main(String[] args){
	MyGeneric<String,Integer> g1=new MyGeneric(23,"Hello",56);
	MyGeneric<Integer,String> g2=new MyGeneric(23,35,"Kishan");
	System.out.println(g1.getT1());
	System.out.println(g1.getT2());
	System.out.println(g2.getT1());
	System.out.println(g2.getT2());
}
}

