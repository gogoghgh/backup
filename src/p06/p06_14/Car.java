package p06.p06_14;

public class Car {
	// ������
//	Car(String carNumber, String owner, String carKind, int year) {
//		this.carNumber = carNumber;
//		this.owner = owner;
//		this.carKind = carKind;
//		this.year = year;
//	}	// ������� �����ϱ� ����,, ��� ���� ���� ��� �갡 �ν��ϳ�?
	// �����δ� ���������� ���ǵǱ� ������~~ ��������

	public Car(String carNumber, String owner, String carKind, int year) {
		super();
		this.carNumber = carNumber;
		this.owner = owner;
		this.carKind = carKind;
		this.year = year;
	} // source �� generate constructor using fields ���� �ڵ����� ���ֳ�~~

	// �������
	String carNumber;

	String owner;
	String carKind;
	int year;

	// �޼���
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
