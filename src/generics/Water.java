package generics;

public class Water {
	public void doPrinting() { // override..
		System.out.println("Water 재료로 출력합니다");
	}

	@Override
	public String toString() {
		return "재료는 Water 입니다";
	}
}
