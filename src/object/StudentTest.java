package object;

public class StudentTest {

	public static void main(String[] args) {
		Student_1 s1 = new Student_1("ȫ�浿", "2201");
		Student_1 s2 = new Student_1("ȫ�浿", "2201");
		Student_1 s3 = new Student_1("��浿", "2204");

		// toString ������
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// equals ������
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));

	}

}
