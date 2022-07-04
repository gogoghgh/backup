package p07.p07_04;

public class Person {
	String name;
	long serialNum;

	// 생성자
	public Person() {
		System.out.println("Person 생성자 1입니다^^ (디폴트 생성자)");
	}

	public Person(String name, long serialNum) {
		super();
		// Person도 부모가 있다?! Object 라는 라이브러리를 기본적으로 받아옴,,모든 클래스의 조상,,,
		this.name = name;
		this.serialNum = serialNum;
		System.out.println("Person 생성자 2입니다^^ (매개변수 2개짜리 생성자)");
	}

	// 게터세터메서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}

	// showInfo메서드
	public void showInfo() {
		System.out.println("name: " + name + " / serialNum: " + serialNum);
	}

}
