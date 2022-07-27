package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet(); // 객체 생성

		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);

		System.out.println("showAllMember~~ please~~~");
		memberHashSet.showAllMember();

		// 아이디 중복 회원 추가
		Member memberHong = new Member(1003, "홍길동");
		memberHashSet.addMember(memberHong);
		System.out.println("길동쓰 넣고 showAllMember");
		memberHashSet.showAllMember();
		// Member class 가서 hashCode(), equals() 오버라이딩!!

	}

}
