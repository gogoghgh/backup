package chapter2;

public class ImplicitConversion {
	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
		
		int iNum3 = 1000;
		byte bNum2 =(byte)iNum3;
		System.out.println(bNum2); //byte 범위 넘어서 이상한 값 출력됨
		
	}

}
