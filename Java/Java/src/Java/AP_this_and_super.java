package Java;

class New {
	int x;

	public New(int x) {
		this.x = x; // Remove this x and observe results
	}

	public int getX() {
		return x;
	}

	public int sum(int x, int y) {
		return x + y;
	}

	public int sum1(int x, int y) {
		return this.sum(x, y);
	}
}

public class AP_this_and_super {

	public static void main(String[] args) {
		New nw = new New(5);
		System.out.println(nw.getX());
		System.out.println(nw.sum1(4, 5));
	}
}
