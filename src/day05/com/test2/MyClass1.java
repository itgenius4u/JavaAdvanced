package day05.com.test2;

class MyThread extends Thread {
	private String threadName;
	MyThread(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		System.out.println(threadName + ", " + this.getId());
	}	
}
public class MyClass1 {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + ", " +
				mainThread.getId());
		MyThread m1 = new MyThread("MyThread #1");
		m1.start();
	}
}
