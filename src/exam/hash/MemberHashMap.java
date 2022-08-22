package exam.hash;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	// 멤버변수
	private HashMap<Integer, Member> hashMap;

	// 생성자
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	// HashMap에 회원을 추가하는 메서드
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
				// key-value 쌍으로 추가
	}

	// HashMap에 회원을 삭제하는 메서드
	public boolean removeMember(int memberId) {
			// HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			//해당 회원 삭제
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}
	
	// Iterator를 사용해 전체 회원을 출력하는 메서드
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); 
									// keySet(): 모든 key값이 Set(집합) 객체로 반환됨
											// + 반환된 Set 객체에 iterator로 key값 하나씩 순회~~
		while (ir.hasNext()) { // 다음 key가 있다면
			int key = ir.next(); // key값을 가져와서
			Member member = hashMap.get(key); // key로부터 value(=member) 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}