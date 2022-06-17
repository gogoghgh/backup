package p06_17;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x 입력하세요 >> ");
		int x = sc.nextInt();
		System.out.println("y 입력하세요 >> ");
		int y = sc.nextInt();
		
		c1.add(x, y);
		c1.sub(x, y);
		c1.mul(x, y);
		c1.div(x, y);
		
		System.out.println("add: " + c1.add(x, y));
		System.out.println("sub: " + c1.sub(x, y));
		System.out.println("mul: " + c1.mul(x, y));
		System.out.println("div: " + c1.div(x, y));

	}

}
