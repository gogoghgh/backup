package scheduler;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R: �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L: ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P: �켱������ ���� �� ���� �Ҵ�");
		System.out.println("A: ������");

		int ch = System.in.read(); // �Ҵ� ����� �Է¹޾� ch������ ����
		Scheduler scheduler = null;

		if (ch == 'R' || ch == 'r') { // �Է¹��� ���� R, r�̸� RoundRobin Ŭ���� ����
			scheduler = new RoundRobin();
//			RoundRobin scheduler1 = new RoundRobin(); // �������̽� ���� ���� ���� �غ��� ��...
														// �̷��� �ϴϱ� �Ȱ��� �ڵ���� �ݺ��ǳ�,,
//			scheduler1.getNextCall();
//			scheduler1.sendCallToAgent();

		} else if (ch == 'L' || ch == 'l') { // �Է¹��� ���� L, l�̸� LeastJob Ŭ���� ����
			scheduler = new LeastJob();
//			LeastJob scheduler2 = new LeastJob();
//			scheduler2.getNextCall();
//			scheduler2.sendCallToAgent();

		} else if (ch == 'P' || ch == 'p') { // �Է¹��� ���� P, p�̸� PriorityAllocation Ŭ���� ����
			scheduler = new PriorityAllocation();
//			PriorityAllocation scheduler3 = new PriorityAllocation();
//			scheduler3.getNextCall();
//			scheduler3.sendCallToAgent();

		} else if (ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.. ����");
			return; 
			//return �� �ϸ� ��� ������ �������� �ؿ� ��ɾ�鵵 ������,, ������,,,
			//return �Ἥ �������� �ٽ� ������ ����������!!
		}

		// � ��å�ΰ��� �������!!! �������̽��� ������ �޼��� ȣ��
		// ��~~����~~
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	} // main
}
