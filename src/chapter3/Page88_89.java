package chapter3;

public class Page88_89 {

	public static void main(String[] args) {
		System.out.println("-----------Q1");
		int myAge = 23;
		int teacherAge = 38;

		boolean value = (myAge > 25);
		System.out.println(value);

		System.out.println(myAge <= 25);
		System.out.println(myAge == teacherAge);

		char ch;
		ch = (myAge > teacherAge) ? 'T' : 'F';
		System.out.println(ch);

		System.out.println("-----------Q2");
		int num;
		num = -5 + 3 * 10 / 2;
		System.out.println(num);

		System.out.println("-----------Q3");
		int q3num = 10;
		System.out.println(q3num); // 10
		System.out.println(q3num++);// 10
		System.out.println(q3num);// 11
		System.out.println(--q3num);// 10

		System.out.println("-----------Q4");
		int q4num1 = 10;
		int q4num2 = 20;
		boolean result;

		result = ((q4num1 > 10) && (q4num2 > 10));
		System.out.println(result); // false
		result = ((q4num1 > 10) || (q4num2 > 10));
		System.out.println(result); // true
		System.out.println(!result); // false

		System.out.println("-----------Q5");
		int q5num1 = 2; // 0010
		int q5num2 = 10; // 1010

		System.out.println(q5num1 & q5num2); // 0010 --- 2
		System.out.println(q5num1 | q5num2); // 1010 --- 10
		System.out.println(q5num1 ^ q5num2); // 0111 --- 7 XXX 1000 ---8
		System.out.println(~q5num1); // 1101 ---11 ????

		System.out.println("-----------Q6");
		int q6num = 8;

		System.out.println(q6num += 10); // 18
		System.out.println(q6num -= 10); // -2 가 아니라~~~ 위에서 대입했으니까~~~~~ 8
		System.out.println(q6num >>= 2); // 비트를 오른쪽으로 이동하고, 그 값을 왼쪽 항에 대입 0??
		// 8= 1000 --> 0010 = 2

		System.out.println("-----------Q7");
		int q7num = 10;
		int q7num2 = 20;

		int q7result = (q7num >= 10) ? (q7num2 + 10) : (q7num2 - 10);
		System.out.println(q7result); //30

	}

}
