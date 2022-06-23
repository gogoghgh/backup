package p06_23;

public class Company { // Company Ŭ������ public��,, '������'�� private
	// step 2
	private static Company instance = new Company(); // �����ϰ� ������ �ν��Ͻ�

	// step 1
	private Company() {
	} // private �����ڴϱ� -> �ܺ� Ŭ�������� ���� ��ü���� �� ��

	// step 3
	// �ν��Ͻ��� �ܺο��� ������ �� �ֵ��� public �޼��� ����!! �ݵ�� static����!!
	// �ֳĸ� getInstance() �޼���� /
	// �ν��Ͻ� ������ ��� ���� (= �����ڰ� private�̴ϱ� �ܺο��� �� �����ݾƿ�)
	// ȣ���� �� �־�� �ϱ� ������....
	public static Company getInstance() { // ���� Ÿ���� Company class Ÿ���� �޼���
		if (instance == null) { // Ȥ~~�ó� null�̸�,,, �̷��� �ض�~~ �� �־ ��� ����
			instance = new Company();
		}
		return instance; // step2���� �����ϰ� ������ �ν��Ͻ� ��ȯ
	} // �����ϰ� instance= ������ new �ؼ� ������ Company Ŭ���� Ÿ���� �ν��Ͻ��ϱ�
		// ������Ÿ���� Company

}
