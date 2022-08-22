package exam.hash;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
	// �������
	private HashMap<Integer, Member> hashMap;

	// ������
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	// HashMap�� ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
				// key-value ������ �߰�
	}

	// HashMap�� ȸ���� �����ϴ� �޼���
	public boolean removeMember(int memberId) {
			// HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			//�ش� ȸ�� ����
			return true;
		}

		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	// Iterator�� ����� ��ü ȸ���� ����ϴ� �޼���
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); 
									// keySet(): ��� key���� Set(����) ��ü�� ��ȯ��
											// + ��ȯ�� Set ��ü�� iterator�� key�� �ϳ��� ��ȸ~~
		while (ir.hasNext()) { // ���� key�� �ִٸ�
			int key = ir.next(); // key���� �����ͼ�
			Member member = hashMap.get(key); // key�κ��� value(=member) ��������
			System.out.println(member);
		}
		System.out.println();
	}
}