package quiz.chapter11;

class MyDog {
	String name;
	String type;

	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "type: " + type + "  name: " + name;
	}

//	// 정보 출력 메서드
//	public String info() {
//		return type + name; 
//	}

}

public class Q4 {

	public static void main(String[] args) {
		MyDog dog = new MyDog("댕댕이", "진돗개");
		System.out.println(dog);
		// 아~ 그냥 생성자 toString 재정의하면 되는 거였군~~~

//		StringBuffer buffer = new StringBuffer();
//		System.out.println(dog.info());
	}

}
