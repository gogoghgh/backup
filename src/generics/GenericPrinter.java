package generics;

public class GenericPrinter<T extends Material> { // extends 예약어로 사용할 수 있는 자료형에 제한을 둠
	// T 자료형으로 선언한 변수
	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	// T 자료형 변수 material을 반환하는 제네릭 메서드
	public T getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}

	public void printing() {
		material.doPrinting();  // 상위 클래스 Material의 메서드 호출
	}

}