package Java;

class MaruThread extends Thread{
	MaruThread(String name){
		super(name);
	}
	public void run() {
		int i=5000;
		while(i<5000) {
			System.out.println(this.getName());
			i++;
		}
	}
}

public class BB_Thread_Priorities {

public static void main(String[] args) {
		MaruThread mt1 = new MaruThread("MT1");
		MaruThread mt2 = new MaruThread("MT2");
		MaruThread mt3 = new MaruThread("MT3");
		MaruThread mt4 = new MaruThread("MT4");
		MaruThread mt5 = new MaruThread("MT5");
		mt5.setPriority(Thread.MAX_PRIORITY);
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		mt5.start();
		
		
	}
}

