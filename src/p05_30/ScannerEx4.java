package p05_30;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		// �ʸ� �Է¹ް� --> �ð�, ��, �ʷ� �ٲٱ�
		System.out.println("�ʸ� �Է��ϼ����");
		Scanner sc = new Scanner(System.in);
		int inputSecond = sc.nextInt();

		//�� ��
		int second = inputSecond % 60;
		int minite = inputSecond / 60;
		if (minite == 60) {
			minite = 0;
		}
		int hour = inputSecond / 3600;

		String result = hour + "�ð�" + minite + "��" + second + "�� �Դϴ�";
		System.out.println(result);

		/* ������ ��
		int hour = time / 3600;
		int min = time % 3600 / 60;   //time-(hour*3600) �ð����� ���� ������ ���� ������! 60���� ������ ���� ����
		int sec = time % 3600 % 60;   //�ð� ������ ������ ���� ������ ���� ������! �� ���� 
		
		System.out.println(hour+"�ð� "+min+"�� "+sec+"�� �Դϴ�");
		���ĺ��� �߿��� �� ���� �ʿ��� ���� �����س��� ���� �� �ִ°�~~ ���� ����� �� �߿�!!!
		+ ����Ʈ � �������� �Ұǰ��� �߿�
		�� �Է� ---> ó�� ---> ��� �� ����ڰ� ���� ���� �����
		*/
	}

}
