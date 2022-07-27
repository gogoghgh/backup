package chapter12.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter12.collection.Member; // Member Ŭ������ collection ��Ű���� �����Ƿ�, ����Ϸ��� import..

public class MemberArrayList {
	// ArrayList ����... Member������
	private ArrayList<Member> arrayList;

	// ������
	// Member������ ������ ArrayList ����
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}

	// add�ϴ� �޼���
	// ArrayList�� ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	// ���� ���ϴ� ��ġ!! Ư�� ��ġ i�� ȸ�� �߰�
	public void insertMember(int index, Member member) {
		arrayList.add(index, member);
	}

	// remove�ϴ� �޼���
	// ArrayList���� �ش� ���̵� ���� ȸ���� ã�� ������
	public boolean removeMember(int memberID) {
//		for (int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); // get()�޼���� ȸ���� ���������� ������
//			int tempID = member.getMemberID(); // ���� �ϱ� ��,, üũ�ϴ� �뵵�� �ӽ� ID..?
//				// �� ��� ID�� Member Ŭ�������� getMemberID�� �����ͼ�, tempID�� ����~
//				// tempID(=�� ID), �⺯���� ���� memberID�� ��!!!
//			if (tempID == memberID) { // ȸ�� ���̵�(tempID)�� ���� �Ű�����(memberID)�� ��ġ�ϸ�
//				arrayList.remove(i); // �ش� ȸ���� ����
//				return true;
//			}
//		} // for
		
//		---------------------- Iterator ����ؼ� -----------------------
//		p422		
		Iterator<Member> ir =  arrayList.iterator(); // Iterator ��ȯ
		while(ir.hasNext()) {  // ��Ұ� �ִ� ����
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {  // ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(member); // �ش� ȸ�� ����
				return true;
			}
		}
		
		System.out.println(memberID + "�� �������� �ʽ��ϴ�"); 
			//�ݺ����� ���� ������ �Ű������� ���� ���̵� �� ��� ���̵� list���� ã�� ���� ���
			// Iterator  --> ���� ������ �����Ϸ��� ���� ã�� ���� ��� 
		return false;
	} // removeMember
	
	// ��ü ȸ�� ����ϴ� �޼���
	public void showAllMembers() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
