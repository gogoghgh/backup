package p06_14;

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
		// �� �ܰ� ���� ���ľ� --> s3.korean = kSub; �� ������
		
		s3.korean = kSub;
		s3.math = mSub;
		
		System.out.println("���� ���� "+ s3.korean.scorePoint); //90 ���!!
		
		
		//����!!! 
		// s3 ��ü ���� -> Student3 �⺯ �߿� koreanScore�� 90�� �����ϰ� ������ �� ��,, 
		// koreanScore�� Subject Ŭ���� Ÿ���̶�!!!
		// Subject Ŭ���� ���赵 ���� kSub, mSub��� �������� ���� new �ؼ� ���� ��ü ����
		// 
		
//		s3.korean = new Subject();
//		s3.math = new Subject();
//				//'SubjectŸ��'�� korean ��� ����,, �⺻ Ÿ���� �ƴ���~ �����ڰ� ������ Ÿ����
//				//subjectŸ���� ����? ��ü��.. new subject��.. ��ü ������ subject...?
//		//Subject ... = new Subject(); �ϱ�!!!
//					// 	 �� ������ �̰� ����.....


		System.out.println(s3.studentID);
		System.out.println(s3.studentName);
		System.out.println(s3.korean); // '����' ���������̶� �ּҰ��� ��µ�..
		System.out.println(s3.math); // p06_14 -> Subject class ��~~~ ->
		System.out.println(s3.korean.scorePoint); // 0 ��� -> �ʱⰪ
		System.out.println(s3.math.SubjectName); // null ��� -> �ʱⰪ --> �̾��µ� ���� �� �־���� ���� ��µ�..
		System.out.println(s3.korean.SubjectName);

	}

}
