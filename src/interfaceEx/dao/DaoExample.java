package interfaceEx.dao;

public class DaoExample {
	       // dbWork�� static �޼��� !!�� ��ü ������ �ʿ䰡 X
	public static void dbWork(DataAccessObject dao) {  
				              // �� ��� �������̽�... �������̽� Ÿ���� new �����ݾƿ�?!?! 
		                      // �״ϱ� �Ű������� �� �������̽��� �Ϻ��ϰ� implements�� Ŭ������ new �ؾ� �� ....
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		DaoExample.dbWork(new OracleDao()); // ���� DaoExample Ŭ���� �ȿ� �־~ �ϴ���� �̷��� �ᵵ �ǰ�(����)
		dbWork(new MysqlDao());                // DaoExample. ���� �� �̷��� �ᵵ ��...
		
		// �޼��忡��,,, �Ű������� Ŭ����Ÿ���� �����Ǿ� �ִ�? �ϸ� -> �޼��� ȣ���� �� new Ŭ���� <<�̰� �Ű�����������,,,,?
		// ����~ OracleDao, MysqlDao�� --> DataAccessObject�������̽��� ������ ����̱���~ �׷��ϱ� new ���� �� �ֳ� 
		
	} //main

}