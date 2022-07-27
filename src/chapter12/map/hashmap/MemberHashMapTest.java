package chapter12.map.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		System.out.println("모든 멤버 출력");
		memberHashMap.showAllMember();
		
		System.out.println("key값=회원아이디가 1004인 회원 제거 후");
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}

}
