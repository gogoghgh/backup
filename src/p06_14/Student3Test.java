package p06_14;

public class Student3Test {

	public static void main(String[] args) {
		Student3 s3 = new Student3(); // ��ü ���� ��
		s3.studentID = 12345;
		s3.studentName = "������";

		Subject kSub = new Subject();
		kSub.SubjectName = "����";
		Subject mSub = new Subject();
		mSub.SubjectName = "����";

//		s3.korean = new Subject();
//		s3.math = new Subject();
//				//'SubjectŸ��'�� korean ��� ����,, �⺻ Ÿ���� �ƴ���~ �����ڰ� ������ Ÿ����
//				//subjectŸ���� ����? ��ü��.. new subject��.. ��ü ������ subject...?
//		//Subject ... = new Subject(); �ϱ�!!!
//					// 	 �� ������ �̰� ����.....
		s3.korean = kSub;
		s3.math = mSub;

		System.out.println(s3.studentID);
		System.out.println(s3.studentName);
		System.out.println(s3.korean); // '����' ���������̶� �ּҰ��� ��µ�..
		System.out.println(s3.math); // p06_14 -> Subject class ��~~~ ->
		System.out.println(s3.korean.scorePoint); // 0 ��� -> �ʱⰪ
		System.out.println(s3.math.SubjectName); // null ��� -> �ʱⰪ --> �̾��µ� ���� �� �־���� ���� ��µ�..
		System.out.println(s3.korean.SubjectName);

	}

}
