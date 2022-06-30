package p06.p06_14;

import java.util.Scanner;

public class MyDate {
	// 생성자

	Scanner sc = new Scanner(System.in);
	
	public MyDate() {}
	
	public MyDate(int year, int month, int day) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	// 멤버변수덜
	private int day;
	private int month;
	private int year;
	// private int day, month, year;

	
	// 메서드덜
	public void setDay() {
		System.out.println("day 입력하삼");
		int day = sc.nextInt(); 
//		여기다가 할 필요 없었네~~ 걍 메인에서 생성자 만들 때 매개변수로 nextInt하니까 걍 
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다(day: 1~28까지 입력해주삼)");
			} else {
				this.day = day;
			}
		} else
			this.day = day;

	}

	public void setMonth() {
		System.out.println("month 입력하삼");
		int month = sc.nextInt();
		
		if (month < 1 || month > 12) {
			System.out.println("오류입니다(month: 1~12까지 입력해주삼)");
		} else {
			this.month = month;
		}
	}

	public void setYear() {
		System.out.println("year 입력하삼");
		int year = sc.nextInt();
		
		if (year < 0) {
			System.out.println("오류입니다");
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

	// 더 자세히 하려면 103쪽 보면서!!!
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
//			} // 2월에~ day가 1보다 작고 28보다 크면(=비정상)? false를 리턴
//		} // 정상이면?? 빠져나와서,,
//
//		return true; // true를 리턴
//	}

//		내 답^^;;
//		return (day <1 || day>28? )? System.out.println("유효하지 않은 날짜입니다") : System.out.println("유효한 날짜입니다")
//				}

// 숙제
//	switch (month) {
//	case 1, 3, 5, 7, 8, 10, 12 : 
//	case 2:
//	case 4, 6, 9, 11: 	}

	}
}
