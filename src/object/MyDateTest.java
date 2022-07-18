package object;

import java.util.Objects;

// 362p 나혼자 코딩
class MyDate {
	int day;
	int month;
	int year;

	// 생성자쓰
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// 자동으로 재정의해보기!!!!!
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
		// 연 월 일 같으면 해쉬코드도 똑같이
//		return day + month + year; 처럼.. 개발자 맘대로 정할 수도 있지만~~^^ 뭐지 알쥐?
		// 41002는 어디서 나온 거? ... 변수 - hash값들이 모여있는 hash table이 있음!!! 거기서 뽑아온다,,,,,,,,
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
		// 년, 월, 일 같으면~~ equal^^ 와우 편하네!!
	}

	// equals() 재정의!!!1
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
		System.out.println("==== 개발자가 바꾼 hash code 값 ==== ");
		System.out.println("date1.hashCode(): " + date1.hashCode());
		System.out.println("date2.hashCode(): " + date2.hashCode());
		System.out.println();
		System.out.println("==== 찐 hash code값 ====");
		System.out.println("System.identityHashCode(date1): " + System.identityHashCode(date1));
		System.out.println("System.identityHashCode(date2): " + System.identityHashCode(date2));
	}
}
