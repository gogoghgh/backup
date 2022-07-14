package scheduler;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선순위가 높은 고객 먼저 할당");
		System.out.println("A: 상담원쓰");

		int ch = System.in.read(); // 할당 방식을 입력받아 ch변수에 대입
		Scheduler scheduler = null;

		if (ch == 'R' || ch == 'r') { // 입력받은 값이 R, r이면 RoundRobin 클래스 생성
			scheduler = new RoundRobin();
//			RoundRobin scheduler1 = new RoundRobin(); // 인터페이스 구현 없이 먼저 해보는 중...
														// 이렇게 하니까 똑같은 코드들이 반복되넴,,
//			scheduler1.getNextCall();
//			scheduler1.sendCallToAgent();

		} else if (ch == 'L' || ch == 'l') { // 입력받은 값이 L, l이면 LeastJob 클래스 생성
			scheduler = new LeastJob();
//			LeastJob scheduler2 = new LeastJob();
//			scheduler2.getNextCall();
//			scheduler2.sendCallToAgent();

		} else if (ch == 'P' || ch == 'p') { // 입력받은 값이 P, p이면 PriorityAllocation 클래스 생성
			scheduler = new PriorityAllocation();
//			PriorityAllocation scheduler3 = new PriorityAllocation();
//			scheduler3.getNextCall();
//			scheduler3.sendCallToAgent();

		} else if (ch == 'A' || ch == 'a') {
			scheduler = new AgentGetCall();
		}
		else {
			System.out.println("지원되지 않는 기능입니다.. ㅈㅅ");
			return; 
			//return 안 하면 계속 밑으로 내려가서 밑에 명령어들도 실행함,, 오류남,,,
			//return 써서 메인으로 다시 돌려서 끝내버리기!!
		}

		// 어떤 정책인가와 상관없이!!! 인터페이스에 선언한 메서드 호출
		// 오~~좋네~~
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	} // main
}
