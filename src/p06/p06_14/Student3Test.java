package p06.p06_14;

public class Student3Test {

	public static void main(String[] args) {
		Student3 s3 = new Student3(); // ��ü ���� ��
		s3.studentID = 12345;
		s3.studentName = "������";
//		s3.koreanScore = 90;
		
		Subject kSub = new Subject();
		kSub.SubjectName = "����";
		kSub.scorePoint = 90;
		Subject mSub = new Subject();
		mSub.SubjectName = "����";
		mSub.scorePoint = 99;
		// �� �ܰ� ���� ���ľ� --> s3.korean = kSub; �� ������
		// ���.. ���������ʹ� ��-> �Ʒ��� ���������̴ϱ�
		
		s3.korean = kSub;
		s3.math = mSub;
		
		System.out.println("���� ���� "+ s3.korean.scorePoint); //90 ���!!
		System.out.println("s3.studentID = " + s3.studentID);
		System.out.println("s3.studentName = " + s3.studentName);
		System.out.println("s3.korean = " + s3.korean); // '����' ���������̶� �ּҰ��� ��µ�..
		System.out.println("s3.math = " + s3.math); // p06_14 -> Subject class ��~~~ ->
		System.out.println("s3.korean.scorePoint = " + s3.korean.scorePoint); // 0 ��� -> �ʱⰪ
		System.out.println("s3.math.scorePoint = " + s3.math.scorePoint);
		System.out.println("s3.math.SubjectName = " + s3.math.SubjectName); // null ��� -> �ʱⰪ --> �̾��µ� ���� �� �־���� ���� ��µ�..
		System.out.println("s3.korean.SubjectName = " + s3.korean.SubjectName);
		
		//����!!! 
		// s3 ��ü ���� -> Student3 �⺯ �߿� koreanScore�� 90�� �����ϰ� ������ �� ��,, 
		// koreanScore�� Subject Ŭ���� Ÿ���̶�!!!
		// Subject Ŭ���� ���赵 ���� kSub, mSub��� �������� ���� new �ؼ� ���� ��ü ����
		// 
		
//		s3.korean = new Subject();
//		s3.math = new Subject();
//		'Subject Ŭ���� Ÿ��'�� korean ��� ����,, �⺻ Ÿ���� �ƴ���~ �����ڰ� ������ Ÿ����
//		Subject Ŭ���� Ÿ���� ����? ��ü��.. new subject��.. ��ü ������ subject...?
//		//Subject ... = new Subject(); �ϱ�!!!
//					 	 �� ������ �̰� ����..... = kSub, mSub�� Subject Ŭ���� Ÿ���̴�~~~ �׷��ϱ� �� �� ����


	}

}
