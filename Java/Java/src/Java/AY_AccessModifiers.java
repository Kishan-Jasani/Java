package Java;
//Access Modifiers determines whether the other classes can use particular property or not
/*
  
Modifier        class 				Package					subclass     				world
---------------------------------------------------------------------------------------------------
public				Y					Y						Y						Y
protected		    Y					Y						Y						N
default(no)			Y					Y						N						N
private			    Y					N						N						N

*/


class Modifier{
	public int x=5;
	protected int y=6;
	int z=7;
	private int a=8;
	
	public void meth1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}
}

public class AY_AccessModifiers {

public static void main(String[] args) {
		Modifier mf = new Modifier();
		mf.meth1();
		System.out.println(mf.x);
		System.out.println(mf.y);
		System.out.println(mf.z);
//		System.out.println(mf.a);   throw an error because a has a private access
	}
}

