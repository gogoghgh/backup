package object;

import java.util.Objects;

public class Student_1 {
	String name;
	String sn;

	Student_1(String name, String sn) {
		this.name = name;
		this.sn = sn;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n 학번: " + sn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sn);
	}

//	@Override
//	public boolean equals(Object obj) { // Object는 모든 클래스의 조상이니까 ㅇㅋ
//		// 다운 캐스팅할 때 instanceof로 체크 먼저 해주고!!
//		if (obj instanceof Student) {
//			Student s = (Student) obj;
//			if (this.name.equals(s.name) && this.sn.equals(s.sn)) {
//				return true; // 이름도 같고, sn도 같으면 ? 같은 사람,, = true.....
//			}
//		}
//		return false;
//	}
//  이런 equals 쉽게 하라고~~ source에 이미 만들어 놨음.. 

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 같은 메모리값 = 같은 값..
			return true;
		if (obj == null) // null값이면 무조건 false
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj; // down casting..
		return Objects.equals(name, other.name) && Objects.equals(sn, other.sn); 왜 오류나냐,, 슬프게
	} // ????/????? 띠용~~~~~^^;;;

}
