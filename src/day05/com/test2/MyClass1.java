package day05.com.test2;

class MyThread extends Thread {
	private String threadName;
	private int executeTime;
	MyThread(String threadName, int executeTime) {
		this.threadName = threadName;
		this.executeTime = executeTime;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(executeTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		MyThread m2 = new MyThread("MyThread #2");
		m2.start();
	}
}
