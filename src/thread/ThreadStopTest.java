package thread;

import java.util.Scanner;

public class ThreadStopTest {

	public static void main(String[] args) {
		ResourceUseThread t = new ResourceUseThread();
		t.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("stop �Է� �� ����");
		if(sc.nextLine().equals("stop")) t.flag = false;
		sc.close();
		System.out.println("���� ����-------------");
	}

}


/////////////////////////////////////////////////////
class ResourceUseThread extends Thread{
	boolean flag = true;
	
	@Override
	public void run() {
		System.out.println("�ڿ� ȹ��");
		while(flag) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�ڿ� ���");
		} // while
		
		System.out.println("�ڿ� ����");
	} // run
	
}