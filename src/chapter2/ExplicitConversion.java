package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1 + fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		System.out.println("-------------");
		int iNum = 10;
		double dNum = 2.0;
		
		System.out.println(iNum + dNum);
		System.out.println(iNum - dNum);
		System.out.println(iNum * dNum);
		System.out.println(iNum / dNum);
		System.out.println(iNum % dNum);
		System.out.println();
		System.out.println((int)(iNum + dNum));
		System.out.println((int)(iNum - dNum));
		System.out.println((int)(iNum * dNum));
		System.out.println((int)(iNum / dNum));
		System.out.println((int)(iNum % dNum));
		
		System.out.println("-------------");
		char a = '\uAC00';
		char b = '\uD604';
		char c = '\uC4F0';
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);		
		
	}

}
