package p06_14;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 2, 2000);
		System.out.print(date1.getYear() + "년  " + date1.getMonth() + "월  " + date1.getDay() + "일");
		if (date1.isValid() == true) {
			System.out.println("  유효한 날짜입니다");
		} else
			System.out.println("  유효하지 않은 날짜입니다");

		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
		if (date1.isValid() == true) {
			System.out.println("유효한 날짜입니다");
		} else
			System.out.println("유효하지 않은 날짜입니다");

//		date.setYear(2023);
//		date.setMonth(2);
//		date.setDay(28);
//
//		System.out.println(date.getYear() + "년");
//		System.out.println(date.getMonth() + "월");
//		System.out.println(date.getDay() + "일");

	}

}
