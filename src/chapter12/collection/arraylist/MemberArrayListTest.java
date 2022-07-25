package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		// add, remove, showAll... �޼���� �ִ� Ŭ����

		// ���ο� ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ���");
		Member inputMem1 = new Member();

		// ArrayList�� ȸ�� �߰�
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberHong); // List�� �ߺ� �����ϱ�,,

		// ��ü ȸ���� ��� ���
		System.out.println();
		System.out.println("----��ü ȸ�� ���----");
		memberArrayList.showAllMembers();

		// ȫ�浿�� ����
		System.out.println("--------ȫ�浿 ����1-------------");
		memberArrayList.removeMember(memberHong.getMemberID());
		memberArrayList.showAllMembers(); // ���� �� �ٽ� ��ü Ⱥ�Ե� ��� ���
		System.out.println("--------ȫ�浿 ����2-------------");
		memberArrayList.removeMember(memberHong.getMemberID());
		memberArrayList.showAllMembers(); // �浿���� ���̶�,,,, ^^.... �� �� ����

		// + Ư�� ��ġ�� ȸ�� �߰� �� -> ��ü Ⱥ ��� ���
		System.out.println("---------0������ ��ġ��------------");
		memberArrayList.insertMember(0, inputMem1);
		memberArrayList.showAllMembers();
	}

}
