package chapter12.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;
	// key value

	// ������
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	// �޼����
	// HashMap�� ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
		// Integer, Member
		// key-value ������ �߰�
	}

	// HashMap���� ȸ���� �����ϴ� �޼���
	public boolean removeMember(int memberID) {
		if (hashMap.containsKey(memberID)) {
			// HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
			hashMap.remove(memberID); // �ش� ȸ�� ����
			return true;
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");
		return false;
	}

	// Iterator�� ����� ��ü ȸ���� ����ϴ� �޼���
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
									// �� ����Ÿ��: Set!!! -> so iterator��...
		while (ir.hasNext()) { // ���� key�� ������
			int key = ir.next(); // key���� �����ͼ�
			Member member = hashMap.get(key); // key�κ��� value ��������
			System.out.println(member);
		} // while
		System.out.println();
	}

}