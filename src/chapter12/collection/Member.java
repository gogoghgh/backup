package chapter12.collection;

import java.util.Objects;
import java.util.Scanner;

import chapter12.collection.arraylist.MemberArrayList;

public class Member implements Comparable<Member> {
	// TreeSet ���� ���� ���� ����,, 
	// Comparable �������̽��� compareTo ������!!!
	@Override
//	public int compareTo(Member member) {
//		return (this.memberID - member.memberID);  // �������� (��-�񱳴����)
//	}
	
//	public int compareTo(Member member) {
//		return (this.memberID - member.memberID)*-1;  // �������� 
//													//    -(��-�񱳴����) 
//													//  = -�� + �񱳴���� 
//													//  = �񱳴���� - ��
//	}
	
//	public int compareTo(Member member) {
//		return (this.memberName.compareTo(member.memberName)); 
//		// �������� abc ������
//	}
	
	public int compareTo(Member member) {
		return (this.memberName.compareTo(member.memberName))*-1; 
		// �������� cba ������
	}

	
	Scanner sc = new Scanner(System.in);

	// �Ӽ�.. = �⺯..
	private int memberID;
	private String memberName;

	// ������
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public Member() { // id, name �Է¹޾Ƽ� �����ϱ�..
						// memberArrayList �� �ڵ����� ����ǰԴ� �� �ǳ�?
		System.out.println("ID�� �Է� >> ");
		this.memberID = sc.nextInt();
		System.out.println("Name �Է� >> ");
		this.memberName = sc.next();

//		MemberArrayList mAL = new MemberArrayList();
//		mAL.addMember(this);
	}

//	public Member(int inputMemID, String inputMemName) {
//	}

	// ���ͼ��� �޼���
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// toString() �޼��� ������
	@Override
	public String toString() {
		return memberName + "ȸ������ ���̵�� " + memberID + "�Դϴ�";
	}

	// HashSet �� ���� �̰� �� �� �� �������̵� ���ֱ�!!!
	// �ڵ� ���� ����
//	@Override
//	public int hashCode() {
//		return Objects.hash(memberID, sc);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return memberID == other.memberID && Objects.equals(sc, other.sc);
//	}

	@Override
	public int hashCode() {
		return memberID; // hashCode() �޼��尡 ȸ�� ���̵� ��ȯ�ϵ��� ������
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // ���� ���� Member���̳�? ���� üũ
			Member member = (Member) obj;
			if (this.memberID == member.memberID)
				return true; // �Ű������� ���� Ⱥ ���̵�(member.memberID)��
								// �ڽ��� Ⱥ ���̵�(this.memberID)�� ���ٸ� true ��ȯ
			else
				return false;
		} // �� if
		return false;
	}

}
