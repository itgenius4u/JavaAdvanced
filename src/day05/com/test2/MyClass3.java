package day05.com.test2;
class MyWork1 extends Thread {
	public void run() {
		for(int inx = 0; inx < 10; inx++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + ", " 
					+ this.getId() + ", Count: "	);
		}
	}
}
class MyWork2 extends Thread {
	public void run() {
		for(int inx = 0; inx < 10; inx++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + ", " 
					+ this.getId() + ", Count: "	);
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
		MyWork1 work1 = new MyWork1();
		MyWork2 work2 = new MyWork2();
		work1.start();
		work2.start();
	}
}




