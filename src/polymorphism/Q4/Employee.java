package polymorphism.Q4;

public class Employee {
	public String name;
	public String grade;
	
	//생성자
	public Employee(String name) {
		this.name = name;
	}
		//매개변수가 있는 생성자 만들었다면
		// -> 디폴트 생성자도 만들어야 함!!! 
	
	public Employee(){ } // 이걸 추가~~ 굿^^
}