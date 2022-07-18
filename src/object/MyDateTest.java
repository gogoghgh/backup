package object;

import java.util.Objects;

// 362p ��ȥ�� �ڵ�
class MyDate {
	int day;
	int month;
	int year;

	// �����ھ�
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// �ڵ����� �������غ���!!!!!
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
		// �� �� �� ������ �ؽ��ڵ嵵 �Ȱ���
//		return day + month + year; ó��.. ������ ����� ���� ���� ������~~^^ ���� ����?
		// 41002�� ��� ���� ��? ... ���� - hash������ ���ִ� hash table�� ����!!! �ű⼭ �̾ƿ´�,,,,,,,,
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
		// ��, ��, �� ������~~ equal^^ �Ϳ� ���ϳ�!!
	}

	// equals() ������!!!1
//	@Override
//	public boolean equals(Object obj) {
//		return date1 = 
//	}

}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println("date1.equals(date2): " + date1.equals(date2));
		System.out.println();
		System.out.println("==== �����ڰ� �ٲ� hash code �� ==== ");
		System.out.println("date1.hashCode(): " + date1.hashCode());
		System.out.println("date2.hashCode(): " + date2.hashCode());
		System.out.println();
		System.out.println("==== �� hash code�� ====");
		System.out.println("System.identityHashCode(date1): " + System.identityHashCode(date1));
		System.out.println("System.identityHashCode(date2): " + System.identityHashCode(date2));
	}
}
