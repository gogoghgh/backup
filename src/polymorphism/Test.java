package polymorphism;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.memberA = 100;
		b.memberA = 20;
		b.memberB = 30;
		// 다 가능
		
		//자동형변환
		a = b;
		System.out.println("a.memberA: " + a.memberA);  
			// a=b 하면서 b 주소값을 -> a에 넣어서
			// a가 B class를 가르키게 되면서.. 100이 아니라 20
		System.out.println();
		
		//수동형변환
		b = (B)
				a; //상-> 하 못넣으니까 수동으로 (B) 붙여서 억지로 억지로 형변환.. 
				  // 원상복구다??? new B로 만들어졌는데 A클래스타입이었다가 -> B로 형변환된거니까?
		System.out.println("a.memberA: " + a.memberA); //근데 왜 a.memberB는 안 뜨지??? ㅇㅋㅇㅋ a는 그대로 A class타입..이니까
		System.out.println("b.memberA: " + b.memberA);
		System.out.println("b.memberB: " + b.memberB);
		
		
		a = b;    // 하 -> 상으로 대입 ㅇㅋ 자동 형변환
		b = (B)a; // A class type인 상위 클래스를 -> 하위 B class type인 b 참조변수에 넣을 수 있나???? 
				  // 아니!!! 근데.. 수동형변환(= (B) )해서 하위클래스 타입으로 변신한 뒤에,, 가능
		
		A c = new A();
		
		b = (B)c;
		//얘는 안된다!!! int memberB가 없어서,,  왜 되노;;;;;;  안되네
		
	}

}
