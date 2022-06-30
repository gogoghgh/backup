package p06.p06_23;

public class Car {
	static int carCount = 10000; // static을 붙여야쥐~~
	int carID;

	public Car() {
		carCount++;
		carID = carCount;
	}

//	//static 멤변이니까 static 메서드로,,
//	static int getCarNum(){
//		return carCount++;
//	}

	// mySonata, yourSonata ID값..
	int getCarNum() {
		return carID;
	}

}
