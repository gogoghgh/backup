package p06.p06_24.array;

public class ArrayEx1 {

	public static void main(String[] args) {
		char[] ch = new char[10]; // ch[0], [1], [2], ... ch[9], ch.length=10

		for (int i = 0; i < ch.length; i++) {
			ch[i] = 65;
			System.out.println("ch[" + i + "]: " + ch[i]); // char 초기값은 공백 유니코드
		}
		System.out.println("ch.length: " + ch.length);
		System.out.println("----------------");
		System.out.println("----------------");

		boolean[] b = new boolean[3];

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "] = " + b[i]); // boolean 초기값은 false
		}
		System.out.println("b.length: " + b.length);
		System.out.println("----------------");
		System.out.println("----------------");

		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			// int sum=0; 을 여기다가 선언하니까 안 나오네,,,
//			System.out.println("num[" + i + "]: " + num[i]);
//			System.out.println(sum += num[i]);
			System.out.println("sum: " + sum);
//			System.out.println("num: " + num[i]);
		}
		System.out.println("num.length: " + num.length);
		System.out.println("----------------");
		System.out.println("----------------");

		double[] data = new double[5];

		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;

		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("----------------");
		System.out.println("----------------");

		char[] alphabets = new char[26]; // alphabets[0] ~ [25], alphabets.length=26
		char ch2 = 'A'; // A=65 B=66... Z=90

		for (int i = 0; i < alphabets.length; i++, ch2++) { // i= 0~25까지 돈다
			alphabets[i] = ch2;
			// i  =   0   1   2   3 ..   25
			// ch2 = 65  66  67  68 ..   90
		}

		for (int i = 0; i < alphabets.length; i++) { // i= 0~25까지 돈다
			System.out.println(alphabets[i] + ", " + (int) alphabets[i]); // 문자 , 숫자..
			
		}
		
		System.out.println("----------------");
		System.out.println("----------------");

	} // main 끝

}
