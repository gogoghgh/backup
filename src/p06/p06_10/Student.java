package p06.p06_10;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
//  ���赵 ��!! --> ������ �޼����..
//	���θ޼��尡 ��׵� ������ͼ� ������ ��������ش�,, =�޸𸮿� �÷��ش�
//	MainClass ���鷯 ���~~~

//	�޼��� ����� //ù��° ���ڴ� �ҹ���
	void printName() { // �̸� ����Ʈ���ִ� �޼���
		System.out.println(studentName);
	}

	// get �޼��� �����
	public String getStudentName() { //studentName �����Ͷ�~
		return studentName;
	} // ������ �ϴϱ� �� �ǰ� �ڵ����� �ϴϱ� �ǳ� ����
	
	
	public static void main(String[] args) { //���� ���� �� ������,, �� �ϴ� �̷���
		System.out.println("------------------------------main--------");
		Student studentAhn = new Student();
		studentAhn.studentName="�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		System.out.println();
		
		Student student1 = new Student();
//		student1.studentName = 
	}

}
