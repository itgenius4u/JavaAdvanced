package day05.com.test2;

class MyTask implements Runnable {
	@Override
	public void run() {
		System.out.println("MyTask");
	}	
}
class MyThread2 extends Thread {
	public void run() {
		System.out.println("MyThread2");
	}	
}
public class MyClass2 {
	public static void main(String[] args) {
		Runnable task = new MyTask();
		Thread thread = new Thread(task);
		thread.start();
		
		MyThread2 thread2 = new MyThread2();
		thread2.start();
	}

}
