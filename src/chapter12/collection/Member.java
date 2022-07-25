package chapter12.collection;

import java.util.Scanner;

import chapter12.collection.arraylist.MemberArrayList;

public class Member {
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

}
