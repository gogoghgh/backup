package p06_14;

public class MyDate {
	// 생성자
	public MyDate(int day, int month, int year) {
	}

	private int day;
	private int month;
	private int year;

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("오류입니다(day: 1~28까지 입력해주삼)");
			} else {
				this.day = day;
			}
		} else
			this.day = day;
//		switch (month) {
//		case
//		}
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("오류입니다(month: 1~12까지 입력해주삼)");
		} else {
			this.month = month;
		}
	}

	public void setYear(int year) {
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

//	public boolean isValid(  ) { if(year==true) {  }
	
	
}
