package p06_10;

public class ArrayEx1 {

	public static void main(String[] args) {
		String[] name = new String[3];
		name[0] = "유가현";
		name[1] = "유지현";
		name[2] = "김순자";
		// name[3] = "유종현"; → X!!!!
		System.out.println(name[2]);
		System.out.println(name);

		int[] num = new int[3];
		num[0] = 1; // 메모리에 연속된 공간에 int형 변수로 들어감
		num[1] = 2;
		num[2] = 3;
		System.out.println(num); // -> [I@7a81197d 출력.... = 메모리에 할당되어져 있는 '주소값'!!!

		char[] ch = new char[3];
		ch[0] = '유';
		ch[1] = '가';
		ch[2] = '현';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch);

//		배열 ♥ for문
//		배열이랑 같이 쓸 때는 되도록이면 i 초기값은 0으로!!! 
//		당근.. 배열dms 0부터 시작이니까
		for (int i = 0; i < 3; i++) {
			System.out.println("ch[" + i + "] = " + ch[i]);
		}

	}

}