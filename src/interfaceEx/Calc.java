package interfaceEx;

public interface Calc {
	double PI = 3.14;
	double ERROR = -999999999; // �������̽����� ������ ������ -> ������ �������� ����� ��ȯ��
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	double divide(int num1, int num2); // �������̽����� ������ �޼���� -> ������ �������� �߻� �޼���� ��ȯ��
	
	int square(int num);
}
