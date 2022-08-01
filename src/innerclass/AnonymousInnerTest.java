package innerclass;

class Outer2 {
	Runnable getRunnable(int i) {
		int num = 100;
		
		// MyRunnable Ŭ���� �̸��� ����!! Ŭ������ �ٷ� �����ϴ� ���
		// 4. �͸� ���� Ŭ����.. Runnable �������̽� ����
		return new Runnable() {
			@Override
			public void run() {
//				num=200; // Local variable num defined in an enclosing scope must be final or effectively final
//				i=10;    // ������������ final,,,, 
				System.out.println("i: " + i);
				System.out.println("num: " + num); 
			} // run() 
		};  // Runnable class
	}// getRunnable

	// �������̽��� �߻� Ŭ������ ������ �����ϰ�, Ŭ������ ������ �����ϴ� ���
	Runnable runner = new Runnable() { // �͸� ���� Ŭ������ ������ ����
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����,, run()�޼���");
		}
	}; // Runnable runner.... Ŭ���� ���� ;�� ��
}//Outer2 class


public class AnonymousInnerTest {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}
}