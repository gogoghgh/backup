package p07.p07_04;

public class ExtendsEx1 {
	public static void main(String args[]) {
		Student s1 = new Student();
		s1.name = "가현스";
		s1.serialNum = 11111111;
		s1.grade =  1;
		s1.showInfo();
		System.out.println();

		Employee e1 = new Employee(); 
		// Employee클래스 갔는데,, 생성자 없네? ㄱㅊㄱㅊ 
		// 컴파일러가 알아서 디폴트 생성자 만듦 + super()까지!! ==> Employee(){super();}
		e1.name = "길동스";
		e1.serialNum = 22222222;
		e1.part = "developer";
		e1.showInfo();
	}
}
