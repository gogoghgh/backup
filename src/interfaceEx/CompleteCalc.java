package interfaceEx;

public class CompleteCalc extends Calculator {
	double answer1;

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		if (num2 != 0) {
			answer1 = (num1 * 1.0) / num2;
			return answer1;
		} else
			return Calc.ERROR;
	}

	@Override
	public int square(int num) {
		return num * num;
	}

	public void showinfo() {
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�^^");
	} // CompleteCalc���� �߰��� ������ �޼���
}
