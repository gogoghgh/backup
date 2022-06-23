package p06_23;

public class CarFactory {
	// step 2
	private static CarFactory instance = new CarFactory();

	// step 1
	private CarFactory() {
	}

	// step 3
	// ����Ÿ��= CarFactory
	public static CarFactory getInstance() {
		return instance;
		// CarFactory�� ����? new CarFactory();
	}
	// �̱���? �ϸ� �� �ܰ� �޷�� ������,,,^^
	// static �޼��� -> static ��� ������ �� �� ����

	// ����Ÿ���� Car�� �޼���
	Car createCar() {
		return new Car();
	}

//	int createCar() {
//		static int serialNum=10000;
//		return serialNum++;
//	}

}
