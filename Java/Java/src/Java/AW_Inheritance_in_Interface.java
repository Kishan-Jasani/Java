package Java;

interface Parent5{
	void meth1();
	void meth2();
}

interface Child5 extends Parent5{
	void meth3();
	void meth4();
}

class ABC implements Child5{
	@Override
	public void meth1() {
	}
	@Override
	public void meth2() {
	}
	@Override
	public void meth3() {
	}
	@Override
	public void meth4() {
	}
	
}
public class AW_Inheritance_in_Interface {

public static void main(String[] args) {
	
	}
}

