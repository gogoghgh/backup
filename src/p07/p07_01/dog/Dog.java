package p07.p07_01.dog;

public class Dog {
	//멤버변수
	private String name;
	private String type;
	
	//생성자
	public Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public Dog(){}
	
	//메서드
	// get set ,... private멤변이니까^^
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	// 정보 출력해주는 메서드
	public String showDogInfo() {
		return "name: " + name + ",  type: " + type;
	}
}
