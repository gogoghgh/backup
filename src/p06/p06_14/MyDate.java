package p06.p06_14;

import java.util.Scanner;

public class MyDate {
	// ������

	Scanner sc = new Scanner(System.in);
	
	public MyDate() {}
	
	public MyDate(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// ���������
	private int day;
	private int month;
	private int year;
	// private int day, month, year;

	
	// �޼����
	public void setDay() {
		System.out.println("day �Է��ϻ�");
		int day = sc.nextInt(); 
//		����ٰ� �� �ʿ� ������~~ �� ���ο��� ������ ���� �� �Ű������� nextInt�ϴϱ� �� 
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("�����Դϴ�(day: 1~28���� �Է����ֻ�)");
			} else {
				this.day = day;
			}
		} else
			this.day = day;

	}

	public void setMonth() {
		System.out.println("month �Է��ϻ�");
		int month = sc.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("�����Դϴ�(month: 1~12���� �Է����ֻ�)");
		} else {
			this.month = month;
		}
	}

	public void setYear() {
		System.out.println("year �Է��ϻ�");
		int year = sc.nextInt();
		
		if (year < 0) {
			System.out.println("�����Դϴ�");
		} else {
			this.year = year;
		}
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// �� �ڼ��� �Ϸ��� 103�� ���鼭!!!
	public boolean isValid() {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (day < 1 || day > 31) {
				return false;
			} else
				return true;
		case 2:
			if (day < 1 || day > 28) {
				return false;
			}
			return true;
		case 4, 6, 9, 11:
			if (day < 1 || day > 30) {
				return false;
			} else
				return true;
		default: return false;
		}

//		if (month == 2) {
//			if (day < 1 || day > 28) {
//				return false;
//			} // 2����~ day�� 1���� �۰� 28���� ũ��(=������)? false�� ����
//		} // �����̸�?? �������ͼ�,,
//
//		return true; // true�� ����
//	}

//		�� ��^^;;
//		return (day <1 || day>28? )? System.out.println("��ȿ���� ���� ��¥�Դϴ�") : System.out.println("��ȿ�� ��¥�Դϴ�")
//				}

// ����
//	switch (month) {
//	case 1, 3, 5, 7, 8, 10, 12 : 
//	case 2:
//	case 4, 6, 9, 11: 	}

	}
}
