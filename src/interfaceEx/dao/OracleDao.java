package interfaceEx.dao;

public class OracleDao implements DataAccessObject {
	@Override
	public void select() {
		System.out.println("oracle DB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("oracle DB에서 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("oracle DB에서 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("oracle DB에서 삭제");
	}
}
