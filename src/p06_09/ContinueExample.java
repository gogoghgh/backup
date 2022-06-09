package p06_09;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;
		
		for(num=1; num<=100; num++) {
			if(num%2 == 0) {continue;} //짝수일 때는 걍 올라가서 num++!!! 하고!!
										//한 줄이니까 if 바로 옆에 적는 게 가독성 굿
			total += num; //num이 홀수일 때만 더한다.. 홀수들 합
			System.out.println("num = " + num + " / total = " + total);
		}
		System.out.println("1~100 홀수의 합은 " + total);
	}

}
