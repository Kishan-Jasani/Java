package Java;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		int i=0;
		while(i<4000) {
			System.out.println("I am a thread2, not a threat");
			i++;
		}
	}	
}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		int y=0;
		while(y<6000) {
			System.out.println("I am a thread3, not a threat");
			y++;
		}
	}
}

public class BA_MultiThreading_with_Runnable_Interface {

public static void main(String[] args) {
		MyThread2 bullet1 = new MyThread2();
		Thread gun1 = new Thread(bullet1);
		MyThread3 bullet2 = new MyThread3();
		Thread gun2 = new Thread(bullet2);
		gun1.start();
		gun2.start();
	}
}

