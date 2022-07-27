package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet(); // ��ü ����

		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);

		System.out.println("showAllMember~~ please~~~");
		memberHashSet.showAllMember();

		// ���̵� �ߺ� ȸ�� �߰�
		Member memberHong = new Member(1003, "ȫ�浿");
		memberHashSet.addMember(memberHong);
		System.out.println("�浿�� �ְ� showAllMember");
		memberHashSet.showAllMember();
		// Member class ���� hashCode(), equals() �������̵�!!

	}

}
