package chapter12.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashSet {
	// HashSet 선언
	private HashSet<Member> hashSet;

	// 메서드
	// HashSet 생성
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	// HashSet에 회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberID) {
		// Iterator를 활용해 순회함.... Set 인터페이스 애들은 get을 못 쓰거덩
		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) { // 다음 요소가 있나? true 일 때 동안,
			Member member = ir.next(); // 회원을 하나씩 가져와서, Member class형의 member 변수에 대입
			int tempID = member.getMemberID(); // 아이디 비교... Member 클래스로부터 아이디 가져와서(게터메서드)
												// 그걸 tempID 변수에 넣는다
			if (tempID == memberID) { // 같은 아이디인 경우
				hashSet.remove(member); // 회원 삭제
				return true;
			}
		} // while
			//
		System.out.println(memberID + "가 존재하지 않습니다");
		return false;
	}

	// 모든 회원 출력
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println("member: " + member);
		}
		System.out.println();
	}
}
