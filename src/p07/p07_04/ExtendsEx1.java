package p07.p07_04;

public class ExtendsEx1 {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "������";
		s1.serialNum = 11111111;
		s1.grade =  1;
		s1.showInfo();
		System.out.println();

		Employee e1 = new Employee(); 
		// EmployeeŬ���� ���µ�,, ������ ����? �������� 
		// �����Ϸ��� �˾Ƽ� ����Ʈ ������ ���� + super()����!! ==> Employee(){super();}
		e1.name = "�浿��";
		e1.serialNum = 22222222;
		e1.part = "developer";
		e1.showInfo();
	}
}
