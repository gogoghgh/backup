package p06_17;

public class GoodsTest {

	public static void main(String[] args) {
		Goods g1 = new Goods("삼성카메라", "123", 10, 3);
		Goods g2 = new Goods("아이패드", "124", 5, 2); 
		Goods g3 = new Goods();
		//생성자가 세터 역할 한 거 아닌가용???
		//생성자는 초기값만 셋팅해주니까,, 재고값 바뀌거나 뭐 수정할 때는 세터가 필요!!!
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1.setSoldNum(11);
		g2.setSoldNum(8);
		System.out.println(g1.getName() + "(코드번호: " + g1.getCode() + "),  팔린 개수: " + g1.getSoldNum() + ",  재고 개수: " + g1.getStockNum());
		System.out.println(g2.getName() + "(코드번호: " + g2.getCode() + "),  팔린 개수: " + g2.getSoldNum() + ",  재고 개수: " + g2.getStockNum());
		
	}

}
