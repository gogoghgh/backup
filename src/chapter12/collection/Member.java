package chapter12.collection;

import java.util.Objects;
import java.util.Scanner;

import chapter12.collection.arraylist.MemberArrayList;

public class Member implements Comparable<Member> {
	// TreeSet 오류 없이 쓰기 위해,, 
	// Comparable 인터페이스에 compareTo 재정의!!!
	@Override
//	public int compareTo(Member member) {
//		return (this.memberID - member.memberID);  // 오름차순 (내-비교대상자)
//	}
	
//	public int compareTo(Member member) {
//		return (this.memberID - member.memberID)*-1;  // 내림차순 
//													//    -(내-비교대상자) 
//													//  = -내 + 비교대상자 
//													//  = 비교대상자 - 내
//	}
	
//	public int compareTo(Member member) {
//		return (this.memberName.compareTo(member.memberName)); 
//		// 오름차순 abc ㄱㄴㄷ
//	}
	
	public int compareTo(Member member) {
		return (this.memberName.compareTo(member.memberName))*-1; 
		// 내림차순 cba ㄷㄴㄱ
	}

	
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

	// HashSet 쓸 때는 이거 두 개 꼭 오버라이딩 해주기!!!
	// 자동 생성 ㅇㅋ
//	@Override
//	public int hashCode() {
//		return Objects.hash(memberID, sc);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return memberID == other.memberID && Objects.equals(sc, other.sc);
//	}

	@Override
	public int hashCode() {
		return memberID; // hashCode() 메서드가 회원 아이디를 반환하도록 재정의
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 들어온 놈이 Member형이냐? 먼저 체크
			Member member = (Member) obj;
			if (this.memberID == member.memberID)
				return true; // 매개변수로 받은 횐 아이디(member.memberID)가
								// 자신의 횐 아이디(this.memberID)와 같다면 true 반환
			else
				return false;
		} // 밖 if
		return false;
	}

}
