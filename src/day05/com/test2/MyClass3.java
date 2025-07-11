package day05.com.test2;
class MyWork1 extends Thread {
	private MyCount myCount;
	MyWork1(MyCount myCount) {
		this.myCount = myCount;
	}	
	public void run() {
		for(int inx = 0; inx < 10; inx++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.myCount.incrementCount();
			System.out.println(this.getName() + ", " 
					+ this.getId() + ", Count: "	 + myCount.getCount());
		}
	}
}
class MyWork2 extends Thread {
	private MyCount myCount;
	MyWork2(MyCount myCount) {
		this.myCount = myCount;
	}	
	public void run() {
		for(int inx = 0; inx < 10; inx++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.myCount.incrementCount();
			System.out.println(this.getName() + ", " 
					+ this.getId() + ", Count: "	 + myCount.getCount());
		}
	}
}
class MyCount {	
	private int count = 0;
	public void incrementCount() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
public class MyClass3 {
	public static void main(String[] args) {
		MyCount sharedCount = new MyCount();
		MyWork1 work1 = new MyWork1(sharedCount);
		MyWork2 work2 = new MyWork2(sharedCount);
		work1.start();
		work2.start();
	}
}




