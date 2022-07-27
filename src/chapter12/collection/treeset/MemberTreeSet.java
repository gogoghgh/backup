package chapter12.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import chapter12.collection.Member;

public class MemberTreeSet {
	// TreeSet ����
	private TreeSet<Member> treeSet;

	// �޼���
	// TreeSet ����
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}

	// TreeSet�� ȸ�� �߰�
	public void addMember(Member member) {
		treeSet.add(member);
	}

	// ȸ�� ����
	public boolean removeMember(int memberID) {
		// Iterator�� Ȱ���� ��ȸ��.... Set �������̽� �ֵ��� get�� �� ���ŵ�
		Iterator<Member> ir = treeSet.iterator();

		while (ir.hasNext()) { // ���� ��Ұ� �ֳ�?-> true ����,
			Member member = ir.next(); // ȸ���� �ϳ��� �����ͼ�~~~
			int tempID = member.getMemberID(); // ���̵� ��
			if (tempID == memberID) { // ���� ���̵��� ���
				treeSet.remove(member); // ȸ�� ����
				return true;
			}
		} // while
		System.out.println(memberID + "�� �������� �ʽ��ϴ�");
		return false;
	} // removeMember

	// ��ü ȸ���� ����ϴ� �޼���
	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println("member: " + member);
		}
		System.out.println();
	}

}
