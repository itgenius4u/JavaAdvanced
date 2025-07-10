package day04.com.test3;

class Member {
	private String name;
	private int score;
	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.score == member.score) {
				return true;	
			}
		}
		return false;
	}
}

public class MyClass4 {
	public static void main(String[] args) {
		Member member = new Member("이순신", 10);
		Member member2 = new Member("세종대왕", 20);
//		if(member.equals(member2)) {
//			
//		}

	}

}
