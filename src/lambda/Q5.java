package lambda;

interface Calc {
	public int add(int num1, int num2);
}

public class Q5 {
	
	public static void main(String[] args) {
//		Calc result = (int num1, int num2) -> {return num1 + num2;};
		Calc result = (n1, n2) -> n1 + n2;
		
		System.out.println("result: " + result);
		System.out.println("result.add(int num1, int num2): " + result.add(10, 20));
		
	}

}
