package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.collection.Member;

public class MemberTreeSet {
	// TreeSet 선언
	private TreeSet<Member> treeSet;

	// 메서드
	// TreeSet 생성
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}

	// TreeSet에 회원 추가
	public void addMember(Member member) {
		treeSet.add(member);
	}

	// 회원 삭제
	public boolean removeMember(int memberID) {
		// Iterator를 활용해 순회함.... Set 인터페이스 애들은 get을 못 쓰거덩
		Iterator<Member> ir = treeSet.iterator();

		while (ir.hasNext()) { // 다음 요소가 있나?-> true 동안,
			Member member = ir.next(); // 회원을 하나씩 가져와서~~~
			int tempID = member.getMemberID(); // 아이디 비교
			if (tempID == memberID) { // 같은 아이디인 경우
				treeSet.remove(member); // 회원 삭제
				return true;
			}
		} // while
		System.out.println(memberID + "가 존재하지 않습니다");
		return false;
	} // removeMember

	// 전체 회원을 출력하는 메서드
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println("member: " + member);
		}
		System.out.println();
	}

}
