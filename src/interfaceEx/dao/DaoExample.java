package interfaceEx.dao;

public class DaoExample {
	       // dbWork는 static 메서드 !!라서 객체 생성할 필요가 X
	public static void dbWork(DataAccessObject dao) {  
				              // ㄴ 얘는 인터페이스... 인터페이스 타입은 new 못하잖아요?!?! 
		                      // 그니까 매개변수로 이 인터페이스를 완벽하게 implements한 클래스로 new 해야 함 ....
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		DaoExample.dbWork(new OracleDao()); // 같은 DaoExample 클래스 안에 있어서~ 하던대로 이렇게 써도 되고(정석)
		dbWork(new MysqlDao());                // DaoExample. 없이 걍 이렇게 써도 됨...
		
		// 메서드에서,,, 매개변수로 클래스타입이 설정되어 있다? 하면 -> 메서드 호출할 때 new 클래스 <<이게 매개변수여야쥐,,,,?
		// 아하~ OracleDao, MysqlDao가 --> DataAccessObject인터페이스를 구현한 놈들이구나~ 그러니까 new 붙일 수 있네 
		
	} //main

}