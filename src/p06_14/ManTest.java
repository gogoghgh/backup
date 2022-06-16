package p06_14;

public class ManTest {

	public static void main(String[] args) {
		Man m1 = new Man();

		m1.setAge(40);
		m1.setName("James");
		m1.setIsMarried(true);
		m1.setKidsNum(3);

		System.out.println("나이: " + m1.getAge());
		System.out.println("이름: " + m1.getName());
		System.out.println("결혼 여부: " + m1.getIsMarried());
		System.out.println("자녀 수: " + m1.kidsNum);

	}
}
