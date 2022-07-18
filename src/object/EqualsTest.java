package object;

import java.util.Objects;

class Student {
	int studentId;
	String studentName;

	// ������
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// toString() �޼��� ������
	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}

	// �ڵ����� �������� hashCode(), equals()..
	@Override
	public int hashCode() {
		return Objects.hash(studentId, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}

	// equals() �޼��� ������!!!!!!!!!!!!!!
//	@Override
//	public boolean equals(Object obj) { //�Ű������� Object��
//		// ���������� ! ���� �� ���� �ϱ� ���ؼ�, instanceof ��������
//		// ����... Student�� ���� Person���̳�,, Customer���̳�,, �̷� �� ������ ��� ��
//		// �׷� ���� �̿��� ����
//		if (obj instanceof Student) { // ���� ���� Student���̳�~ ������~~ �߰�ȣ ����
//			Student std = (Student)obj; // ���� -> ������ ���ϱ� down casting
//										 // �� ��ȯ �� �ϸ� obj. -> studentId �� ���� ...  
//			if (this.studentId == std.studentId) // �������� equals() �޼���.. �ٽ�
//				return true;                     // �л� �й��� ������ true ��ȯ
//			else
//				return false;
//		} // ���̸� �߰�ȣ �ȿ� �� ����, 
//		return false; // Student�� �ƴϸ� false ��ȯ
//	}
	
	
	
	// hashCode() �޼��� ������!!!!
//	@Override
//	public int hashCode() {
//		return studentId; // �ؽ� �ڵ� ������ �й��� ��ȯ�ϵ��� ������^^
//	}
	
	
	

} // Student class ��

public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee; // �ּ� ����
		Student studentSang = new Student(100, "�̻��");

		System.out.println("---------------equals()---------------");
		// studentLee ---- studentLee2
		if (studentLee == studentLee2) // == ��ȣ�� ��
			System.out.println("studentLee�� studentLee2�� �ּҴ�~~ �����ϴ�");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ�~~ �ٸ��ϴ�");

		if (studentLee.equals(studentLee2)) // equals() �޼���� ��
			System.out.println("studentLee�� studentLee2�� �����մϴ�");
		else
			System.out.println("studentLee�� studentLee2�� ���� ���� ");
		System.out.println();

		// studentLee ---- studentSang
		if (studentLee == studentSang) // == ��ȣ�� ��
			System.out.println("studentLee�� studentSang�� �ּҴ�~~ �����ϴ�");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ�~~ �ٸ��ϴ�");

		if (studentLee.equals(studentSang)) // equals() �޼���� ��
			System.out.println("studentLee�� studentSang�� �����մϴ�");
		else
			System.out.println("studentLee�� studentSang�� ���� ���� ");
		
		System.out.println();
		System.out.println("-----------------hashCode()---------");
	
		
		// hashCode()
		System.out.println("studentLee�� hashCode: " + studentLee.hashCode());  //������ ��: 2055281021 -> ��: 100 
		System.out.println("studentSang�� hashCode: " + studentSang.hashCode()); //������ ��: 1554547125 -> ��: 100
		System.out.println(); 
		
		System.out.println("studentLee�� ���� �ּҰ�: " + System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּҰ�: " + System.identityHashCode(studentSang));
													// �� �����ڰ� overriding �� �� ����!! ��������!! �޼�����
		

	}
}