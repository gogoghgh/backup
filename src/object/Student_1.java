package object;

import java.util.Objects;

public class Student_1 {
	String name;
	String sn;

	Student_1(String name, String sn) {
		this.name = name;
		this.sn = sn;
	}

	@Override
	public String toString() {
		return "�̸�: " + name + "\n �й�: " + sn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sn);
	}

//	@Override
//	public boolean equals(Object obj) { // Object�� ��� Ŭ������ �����̴ϱ� ����
//		// �ٿ� ĳ������ �� instanceof�� üũ ���� ���ְ�!!
//		if (obj instanceof Student) {
//			Student s = (Student) obj;
//			if (this.name.equals(s.name) && this.sn.equals(s.sn)) {
//				return true; // �̸��� ����, sn�� ������ ? ���� ���,, = true.....
//			}
//		}
//		return false;
//	}
//  �̷� equals ���� �϶��~~ source�� �̹� ����� ����.. 

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // ���� �޸𸮰� = ���� ��..
			return true;
		if (obj == null) // null���̸� ������ false
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj; // down casting..
		return Objects.equals(name, other.name) && Objects.equals(sn, other.sn); �� ��������,, ������
	} // ????/????? ���~~~~~^^;;;

}
