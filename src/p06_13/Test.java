package p06_13;

public class Test {
	public static void main(String[] args) {
		// Test라는 클래스는 걍 형식적인 클래스,, FunctionTest class를 실행하기 위한
		System.out.println("-------------------------FunctionTest class");
		int num1 = 100;
		int num2 = 5;
		FunctionTest ft = new FunctionTest(); // 객체 생성 완...

		int sum = ft.add(num1, num2);
		System.out.println("(num1) " + num1 + "  +  " + "(num2) " + num2 + "  =  " + "(sum) " + sum + " 입니다");

		System.out.println();
		System.out.println("---------------------------Book class");
		Book b1 = new Book(); // 객체 생성!! //메모리에 북만큼 만들어졌겠죠
		Book b2 = new Book();

//		b1.title = "홍길동";
//		b1.author = "허균";
//		b1.price = 1000;
		b1.setTitle("홍길동");
		b1.setAuthor("허균");
		b1.setPrice(1000);

//		b2.title = "백설공주";
//		b2.author = "미상 몰라";
//		b2.price = 2000;
		b2.setTitle("백설공주");
		b2.setAuthor("몰라요");
		b2.setPrice(2000);

		// set 해서 값 집어넣었고~ /남한테 보여주는 기능 하는 게 get 게터메서드
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println();
//		System.out.println("b2.title = " + b2.title);
//		System.out.println("b2.author = " + b2.author);
//		System.out.println("b2.price = " + b2.price);
		System.out.println(b2.getTitle());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());

	}
}
