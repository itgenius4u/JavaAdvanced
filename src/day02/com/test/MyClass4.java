package day02.com.test;

public class MyClass4 {
	enum Menu {
		Pizza,
		Bread,
		Soba
	};
	public static void main(String[] args) {
		Menu m = Menu.Pizza;
		System.out.println(m);
	}
	void getData(Menu m) {
		switch(m) {
		case Pizza:
			break;
		}
	}
}
