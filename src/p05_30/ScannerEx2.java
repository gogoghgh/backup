package p05_30;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); //��ĳ�� ����. �� ��ĳ�� ���Ŵ�~~ (System.in)= Ű����κ��� �Է¹����ž�
		System.out.println("���������� �Է��Ͻÿ�����"); //����� ���忡�� �����ϱ�~~ ����ڵ��� ���ϰ�.. �����: �� ��� �Է�����,,? X 
		int input = sc.nextInt(); // ����ڰ� ()���⿡ �Է��� ������ --> input ������ ����
		System.out.println("input: " + input);
		System.out.println("");
		
		//���� 60�� �̻��̸� ����ϼ̻�
		System.out.println("���������� �Է��Ͻÿ�����");
		int inputScore = sc.nextInt();
		String result = (inputScore >= 60)? "Pass�Դϴ� ��������" : "Non-Pass �Դϴ٤Ф�";
		System.out.println(result);
		
	}

}
