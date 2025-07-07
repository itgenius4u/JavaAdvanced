package day01.com.test;

public class MyClass5 {

	public static void main(String[] args) {
		String name = "을지문덕";
		if(name == "을지문덕") {
			System.out.println("을지문덕입니다.");
		}
		if(name != "을지문덕") {
			System.out.println("을지문덕이 아닙니다.");
		}
		// if.... if... else ... if ... else if ... else ...
		
		int num = 10;
		switch(num) {
			case 20:
				System.out.println("20입니다.");
//				if(num > 100) {}
				break;
			case 30:
				System.out.println("30입니다.");
				break;
			default:
				System.out.println("40입니다.");
				break;
		}
		
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				if(i == 10) {
					continue;
				}
			}			
			System.out.println();
		}
		int k = 0;
		while(k < 10) {
			System.out.println(k);
			k++;
		}
		int d = 0;
		do {
			System.out.println(d);
			if(d == 8) {				
			} else {
				d++;		
			}
		} while(d < 10);
	}
}
