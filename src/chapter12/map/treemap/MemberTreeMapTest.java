package chapter12.map.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap memberHashMap = new MemberTreeMap();
		
		// ȸ�� ���̵� ������ ���� ���� ȸ�� �߰�
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberSon = new Member(1002, "�չα�");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberHong);
		memberHashMap.addMember(memberSon);
		
		System.out.println("---��ü ȸ�� ��� ����---");
		memberHashMap.showAllMember();
		
		System.out.println("---ȸ�� ���̵�(key��): 1004�� ȸ�� ���� ��---"); 
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		
	}

}
