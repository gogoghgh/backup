package chapter12.map.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		// 회원 아이디 순서와 관계 없이 회원 추가
		Member memberPark = new Member(1003, "박서훤");
		Member memberLee = new Member(1001, "이지원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon = new Member(1002, "손민국");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		System.out.println("---전체 회원 목록 보기---");
		memberHashMap.showAllMember();
		
		System.out.println("---회원 아이디(key값): 1004인 회원 삭제 후---"); 
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		
	}

}
