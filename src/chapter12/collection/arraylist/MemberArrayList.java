package chapter12.collection.arraylist;

import java.util.ArrayList;
import chapter12.collection.Member; // Member 클래스는 collection 패키지에 있으므로, 사용하려면 import..

public class MemberArrayList {
	// ArrayList 선언... Member형으로
	private ArrayList<Member> arrayList;

	// 생성자
	// Member형으로 선언한 ArrayList 생성
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	// add하는 메서드
	// ArrayList에 회원을 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// 내가 원하는 위치!! 특정 위치 i에 회원 추가
	public void insertMember(int index, Member member) {
		arrayList.add(index, member);
	}

	// remove하는 메서드
	// ArrayList에서 해당 아이디를 가진 회원을 찾아 제거함
	public boolean removeMember(int memberID) {
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i); // get()메서드로 회원을 순차적으로 가져옴
			int tempID = member.getMemberID(); // 제거 하기 전,, 체크하는 용도의 임시 ID..?
				// 찐 멤버 ID를 Member 클래스에서 getMemberID로 가져와서, tempID에 넣음~
				// tempID(=찐 ID), 멤변으로 들어온 memberID랑 비교!!!
			if (tempID == memberID) { // 회원 아이디(tempID)가 들어온 매개변수(memberID)와 일치하면
				arrayList.remove(i); // 해당 회원을 삭제
				return true;
			}
		} // for
		System.out.println(memberID + "가 존재하지 않습니다"); 
			//반복문이 끝날 때까지 매개변수로 들어온 아이디를 찐 멤버 아이디 list에서 찾지 못한 경우
		return false;
	} // removeMember
	
	// 전체 회원 출력하는 메서드
	public void showAllMembers() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
