package polymorphism.Q4;

public class Engineer extends Employee {
	// �⺯
	private String skillSet;

	// ������
//	public Engineer() { super(); �� �����Ǿ� �ִ�!!! }
//	
//	public Engineer(String name) {
//		this.name =name;
//	}

	// �޼���
	public String getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
}
