package com.test;

public class MyClass4 {

	public static void main(String[] args) {
		int a = 1;
		int b = a++; // + 1
		System.out.println(b);
		System.out.println(a);
		int a1 = 1;
		int b1 = ++a1;
		System.out.println(b1);
		System.out.println(a1);
		
//		int c = 1;
//		while(c > 100) {
//			c++; // c = c + 1
//		}
		
		//github copilot
		
		String name = "홍길동";
		String msg = (name == "홍길동")?"홍길동입니다.":"누구세요.?";
		System.out.println(msg);
		String name2 = "이순신";
		if(name == name2) {
			System.out.println("O.K");
		} else if(name == "세종대왕") {
			System.out.println("세종대왕입니다.");
		}
		
		switch(name) {
			case "이순신":
				break;
			case "세종대왕" :
				break;
		}
		
		// Code Complete(코드 컴플릿:완성)

	}
}



