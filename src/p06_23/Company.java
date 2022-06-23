package p06_23;

public class Company { // Company 클래스는 public임,, '생성자'가 private
	// step 2
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스

	// step 1
	private Company() {
	} // private 생성자니까 -> 외부 클래스에서 뉴로 객체생성 못 함

	// step 3
	// 인스턴스를 외부에서 참조할 수 있도록 public 메서드 구현!! 반드시 static으로!!
	// 왜냐면 getInstance() 메서드는 /
	// 인스턴스 생성과 상관 없이 (= 생성자가 private이니까 외부에서 뉴 못하잖아염)
	// 호출할 수 있어야 하기 때문에....
	public static Company getInstance() { // 리턴 타입이 Company class 타입인 메서드
		if (instance == null) { // 혹~~시나 null이면,,, 이렇게 해라~~ 안 넣어도 상관 ㄴㄴ
			instance = new Company();
		}
		return instance; // step2에서 유일하게 생성한 인스턴스 반환
	} // ㄴ리턴값 instance= 위에서 new 해서 생성한 Company 클래스 타입의 인스턴스니까
		// ㄴ리턴타입이 Company

}
