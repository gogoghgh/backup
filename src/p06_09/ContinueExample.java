package p06_09;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {
			if(num%2 == 0) {continue;} //¦���� ���� �� �ö󰡼� num++!!! �ϰ�!!
										//�� ���̴ϱ� if �ٷ� ���� ���� �� ������ ��
			total += num; //num�� Ȧ���� ���� ���Ѵ�.. Ȧ���� ��
			System.out.println("num = " + num + " / total = " + total);
		}
		System.out.println("1~100 Ȧ���� ���� " + total);
	}

}
