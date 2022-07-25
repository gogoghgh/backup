package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		// add, remove, showAll... 메서드들 있는 클래스

		// 새로운 회원 인스턴스 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		Member memberHong = new Member(1004, "홍길똥");
		Member inputMem1 = new Member();

		// ArrayList에 회원 추가
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberHong); // List는 중복 ㅇㅋ니까,,

		// 전체 회원들 목록 출력
		System.out.println();
		System.out.println("----전체 회원 목록----");
		memberArrayList.showAllMembers();

		// 홍길동씨 삭제
		System.out.println("--------홍길동 삭제1-------------");
		memberArrayList.removeMember(memberHong.getMemberID());
		memberArrayList.showAllMembers(); // 삭제 후 다시 전체 횐님들 목록 출력
		System.out.println("--------홍길동 삭제2-------------");
		memberArrayList.removeMember(memberHong.getMemberID());
		memberArrayList.showAllMembers(); // 길동쓰는 둘이라,,,, ^^.... 함 더 지움

		// + 특정 위치에 회원 추가 후 -> 전체 횐 목록 출력
		System.out.println("---------0번으로 새치기------------");
		memberArrayList.insertMember(0, inputMem1);
		memberArrayList.showAllMembers();
	}

}
