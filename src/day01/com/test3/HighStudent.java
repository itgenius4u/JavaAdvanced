package day01.com.test3;

public class HighStudent extends MidStudent {
	private String address;

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
	void eating() {
		System.out.println(this.getName() + "가 식사를 한다.");
	}
}
