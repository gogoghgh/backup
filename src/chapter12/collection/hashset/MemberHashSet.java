package chapter12.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter12.collection.Member;

public class MemberHashSet {
	// HashSet ����
	private HashSet<Member> hashSet;

	// �޼���
	// HashSet ����
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	// HashSet�� ȸ�� �߰�
	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberID) {
		// Iterator�� Ȱ���� ��ȸ��.... Set �������̽� �ֵ��� get�� �� ���ŵ�
		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) { // ���� ��Ұ� �ֳ�? true �� �� ����,
			Member member = ir.next(); // ȸ���� �ϳ��� �����ͼ�, Member class���� member ������ ����
			int tempID = member.getMemberID(); // ���̵� ��... Member Ŭ�����κ��� ���̵� �����ͼ�(���͸޼���)
												// �װ� tempID ������ �ִ´�
			if (tempID == memberID) { // ���� ���̵��� ���
				hashSet.remove(member); // ȸ�� ����
				return true;
			}
		} // while
			//
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");
		return false;
	}

	// ��� ȸ�� ���
	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println("member: " + member);
		}
		System.out.println();
	}
}
