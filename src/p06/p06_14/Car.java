package p06.p06_14;

public class Car {
	// 생성자
//	Car(String carNumber, String owner, String carKind, int year) {
//		this.carNumber = carNumber;
//		this.owner = owner;
//		this.carKind = carKind;
//		this.year = year;
//	}	// 멤버변수 선언하기 전에,, 멤버 변수 위에 적어도 얘가 인식하네?
	// 실제로는 병렬적으로 정의되기 때문에~~ ㄱㅊㄱㅊ

	public Car(String carNumber, String owner, String carKind, int year) {
		super();
		this.carNumber = carNumber;
		this.owner = owner;
		this.carKind = carKind;
		this.year = year;
	} // source → generate constructor using fields 가면 자동으로 해주넴~~

	// 멤버변수
	String carNumber;

	String owner;
	String carKind;
	int year;

	// 메서드
	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCarKind() {
		return carKind;
	}

	public void setCarKind(String carKind) {
		this.carKind = carKind;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
