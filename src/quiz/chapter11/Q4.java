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

//	// ���� ��� �޼���
//	public String info() {
//		return type + name; 
//	}

}

public class Q4 {

	public static void main(String[] args) {
		MyDog dog = new MyDog("�����", "������");
		System.out.println(dog);
		// ��~ �׳� ������ toString �������ϸ� �Ǵ� �ſ���~~~

//		StringBuffer buffer = new StringBuffer();
//		System.out.println(dog.info());
	}

}
