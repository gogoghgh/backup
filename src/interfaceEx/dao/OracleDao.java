package interfaceEx.dao;

public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("oracle DB���� �˻�");
	}
	
	@Override
	public void insert() {
		System.out.println("oracle DB���� ����");
	}
	
	@Override
	public void update() {
		System.out.println("oracle DB���� ����");
	}
	
	@Override
	public void delete() {
		System.out.println("oracle DB���� ����");
	}
}
