package thread;

import java.util.Scanner;

public class ThreadStopTest {

	public static void main(String[] args) {
		ResourceUseThread t = new ResourceUseThread();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("stop 입력 시 종료");
		if(sc.nextLine().equals("stop")) t.flag = false;
		sc.close();
		System.out.println("메인 종료-------------");
	}

}


/////////////////////////////////////////////////////
class ResourceUseThread extends Thread{
	boolean flag = true;
	
	@Override
	public void run() {
		System.out.println("자원 획득");
		while(flag) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("자원 사용");
		} // while
		
		System.out.println("자원 종료");
	} // run
	
}