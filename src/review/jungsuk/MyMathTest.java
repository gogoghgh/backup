package review.jungsuk;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5, 3);
		long result2 = mm.subtract(5l, 3l);
		long result3 = mm.multiply(5l, 3l);
		double result4 = mm.divide(5l, 3l);
		
		System.out.println("add(5l, 3l) = " + result1);
		System.out.println("subtract(5l, 3l) = " + result2);
		System.out.println("multiply(5l, 3l) = " + result3);
		System.out.println("divide(5l, 3l) = " + result4);
	}// main

}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
//		return result;
		return a + b;
	}

	long subtract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
} // MyMath class