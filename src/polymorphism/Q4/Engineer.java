package polymorphism.Q4;

public class Engineer extends Employee {
	// 멤변
	private String skillSet;

	// 생성자
//	public Engineer() { super(); 가 생략되어 있다!!! }
//	
//	public Engineer(String name) {
//		this.name =name;
//	}

	// 메서드
	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
}
