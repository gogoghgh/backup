package p07.p07_01.dog;

public class DogTest {

	public static void main(String[] args) {
		Dog[] cuteDogs = new Dog[5];
		// 쌤님의 꼼수
		String[] dogNames = { "멍1", "멍2", "멍3", "멍4", "멍5" };
		String[] dogTypes = { "진돗개", "말티즈", "시베리안", "스피치", "푸들" };
		// 이런 데이터는 나중에 DB에서 들고 오면 됨 매칭시키는,, 라이브러리로?

//		cuteDogs[0] = new Dog("멍1", "진돗개");
//		cuteDogs[1] = new Dog("멍2", "말티즈");
//		cuteDogs[2] = new Dog("멍3", "시베리안");
//		cuteDogs[3] = new Dog("멍4", "스피치");
//		cuteDogs[4] = new Dog("멍5", "푸들");
		// 이렇게 일일이 쳐야 합니꺼,,,,, 내 말이~~

		// for문으로 돌려서 초기값 넣기!! + 꼼수
		for (int i = 0; i < cuteDogs.length; i++) {
			cuteDogs[i] = new Dog(dogNames[i], dogTypes[i]);
		}

		System.out.println("--걍 for문-------------");
		for (int i = 0; i < cuteDogs.length; i++) {
			System.out.println(cuteDogs[i].showDogInfo());
		}
		System.out.println();

		System.out.println("---향상 for문------------");
		for (Dog dogsData : cuteDogs) {
			System.out.println(dogsData.showDogInfo());
		}

//		for(int i = 0; i < cuteDogs.length; i++) {
//			
//		}
//		
//		// 초기값 넣기.. 이거 아니네^^;;
//		for(Dog dog : cuteDogs) {
//			dog = new Dog();
//		}

	}// main

}
