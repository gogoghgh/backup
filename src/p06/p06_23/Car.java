package p06.p06_23;

public class Car {
	static int carCount = 10000; // static�� �ٿ�����~~
	int carID;

	public Car() {
		carCount++;
		carID = carCount;
	}

//	//static �⺯�̴ϱ� static �޼����,,
//	static int getCarNum(){
//		return carCount++;
//	}

	// mySonata, yourSonata ID��..
	int getCarNum() {
		return carID;
	}

}
