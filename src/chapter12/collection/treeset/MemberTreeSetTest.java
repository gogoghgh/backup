package chapter12.collection.treeset;

import java.util.TreeSet;

import chapter12.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet(); // 객체 생성
		
		Member memberPark = new Member(1003, "a 가 박서훤");
		Member memberLee = new Member(1001, "b 나 이지원");
		Member memberSon = new Member(1002, "c 다 손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		System.out.println("showAllMember~~ please~~~");
		memberTreeSet.showAllMember();
		
		// 아이디 중복 회원 추가
		Member memberHong = new Member(1003, "d 라 홍길동");
		memberTreeSet.addMember(memberHong);
		System.out.println("길동쓰 넣고 showAllMember");
		memberTreeSet.showAllMember();
			//Member class 가서 hashCode(), equals() 오버라이딩!!
		
		// 오잉 왜 오류?? comparable 비교할 수가 없다,,,,?
		// hashSet에서는  hashcode, equals를 통해서 비교점을 명시해줬다면,
		// TreeSet은 기존에 설계되어 있는 integer, String... 이런 거는 크다 작다가 이미 들어가 있지요
		// 4> 1, C > A ......
		// 근데 우리가 직접 만든 member 클래스에선 비교할 수 있는 기준점이 없음!!!
		// 아 그래서 오류가~~
		// so Comparable 인터페이스와 Comparator 인터페이스 사용해줘야 한다~~~~~
	
	}

}
