package p06.p06_14;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person( ) {	}
	public Person(String pName) {
		name = pName;
	}
	//이름, 키, 몸무게를 매개변수로 입력받는 생성자
	public Person(String pName, float pHeight, float pWeight) { 
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
	
}
