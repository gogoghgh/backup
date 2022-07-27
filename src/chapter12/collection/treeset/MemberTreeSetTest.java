package chapter12.collection.treeset;

import java.util.TreeSet;

import chapter12.collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet(); // ��ü ����
		
		Member memberPark = new Member(1003, "a �� �ڼ���");
		Member memberLee = new Member(1001, "b �� ������");
		Member memberSon = new Member(1002, "c �� �չα�");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		
		System.out.println("showAllMember~~ please~~~");
		memberTreeSet.showAllMember();
		
		// ���̵� �ߺ� ȸ�� �߰�
		Member memberHong = new Member(1003, "d �� ȫ�浿");
		memberTreeSet.addMember(memberHong);
		System.out.println("�浿�� �ְ� showAllMember");
		memberTreeSet.showAllMember();
			//Member class ���� hashCode(), equals() �������̵�!!
		
		// ���� �� ����?? comparable ���� ���� ����,,,,?
		// hashSet������  hashcode, equals�� ���ؼ� ������ �������ٸ�,
		// TreeSet�� ������ ����Ǿ� �ִ� integer, String... �̷� �Ŵ� ũ�� �۴ٰ� �̹� �� ������
		// 4> 1, C > A ......
		// �ٵ� �츮�� ���� ���� member Ŭ�������� ���� �� �ִ� �������� ����!!!
		// �� �׷��� ������~~
		// so Comparable �������̽��� Comparator �������̽� �������� �Ѵ�~~~~~
	
	}

}
