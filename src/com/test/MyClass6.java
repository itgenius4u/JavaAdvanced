package com.test;
class Company {
	String name;
	String location;
	void operate() {}
	static String address;
} // 붕어빵 틀 -- 설계도
public class MyClass6 {
	public static void main(String[] args) {
		Company kakao = new Company(); // 붕어빵
		kakao.name = "카카오";
		Company naver = new Company();
		naver.name = "네이버";
		Company daum = new Company();
		daum.name = "다음";
	}

}
