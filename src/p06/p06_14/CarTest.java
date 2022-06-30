package p06.p06_14;

public class CarTest {

	public static void main(String[] args) {
//		Car c1 = new Car(); //생성자,, 매개변수에 값이 4개 딱닥딱딱 들어가야 하는데 아무것도 없어서 오류남
//		Car c2 = new Car();
		Car c1 = new Car("1", "홍길동", "A class", 1899);
		Car c2 = new Car("2", "김길동", "C class", 1992);

		System.out.println("소유주: " + c1.getOwner());
		System.out.println("차종: " + c1.getCarKind());
		System.out.println("남바: " + c1.getCarNumber());
		System.out.println("연식: " + c1.getYear());
		System.out.println();
		System.out.println("소유주: " + c2.getOwner());
		System.out.println("차종: " + c2.getCarKind());
		System.out.println("남바: " + c2.getCarNumber());
		System.out.println("연식: " + c2.getYear());
		System.out.println();

		c1.setOwner("유가현");
		c1.setCarKind("렉스톤");
		c1.setCarNumber("12가1234");
		c1.setYear(2021);

		c2.setOwner("김순자");
		c2.setCarKind("캐스퍼");
		c2.setCarNumber("34나3456");
		c2.setYear(2022);

		System.out.println("소유주: " + c1.getOwner());
		System.out.println("차종: " + c1.getCarKind());
		System.out.println("남바: " + c1.getCarNumber());
		System.out.println("연식: " + c1.getYear());
		System.out.println();
		System.out.println("소유주: " + c2.getOwner());
		System.out.println("차종: " + c2.getCarKind());
		System.out.println("남바: " + c2.getCarNumber());
		System.out.println("연식: " + c2.getYear());

	}

}
