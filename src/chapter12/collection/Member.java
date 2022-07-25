package chapter12.collection;

import java.util.Scanner;

import chapter12.collection.arraylist.MemberArrayList;

public class Member {
	Scanner sc = new Scanner(System.in);
	
	// 속성.. = 멤변..
	private int memberID;
	private String memberName;
	

	// 생성자
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	public Member() { // id, name 입력받아서 저장하기..
		             // memberArrayList 에 자동으로 저장되게는 안 되나?
		System.out.println("ID를 입력 >> ");
		this.memberID = sc.nextInt();
		System.out.println("Name 입력 >> ");
		this.memberName = sc.next();
		
//		MemberArrayList mAL = new MemberArrayList();
//		mAL.addMember(this);
	}
	

//	public Member(int inputMemID, String inputMemName) {
//	}

	// 게터세터 메서드
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// toString() 메서드 재정의
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberID + "입니다";
	}

}
