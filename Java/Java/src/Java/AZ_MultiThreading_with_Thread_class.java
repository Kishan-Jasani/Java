package Java;

class MyThreads extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<40000) {
			System.out.println("My thread is running");
			System.out.println("I am Happy");
			i++;
		}
	}
}

class MyThreads1 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<40000) {
			System.out.println("My thread is not good");
			System.out.println("I am Sad");
			i++;
		}
	}
}

public class AZ_MultiThreading_with_Thread_class {

public static void main(String[] args) {
		MyThreads mt1 = new MyThreads();
		MyThreads1 mt2 = new MyThreads1();
		//with start method Run method will automatically execute.
		//Multithreading will run mt1 and mt2 concurrently
		mt1.start();
		mt2.start();
	}
}

