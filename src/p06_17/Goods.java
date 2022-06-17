package p06_17;

public class Goods {
	private String name;
	private String code;
	private int soldNum;
	private int stockNum;
	
	//생성자 만들기.. 설계하기...
	//생성자에는 입력받은 값들을 멤변에 넣어주는 거 있는 게 더 좋다!!!!!!
	//생상자 하는 일: 매개변수 name을 -> 멤버변수에 넣어서 '초기값' 설정하는거!!! ★★
	public Goods(String name, String code, int soldNum, int stockNum) {
		//System.out.println(name + "(코드번호: " + code + "), 팔린 개수: " + soldNum + ", 재고 개수: " + stockNum);
		this.name =name;
		this.code = code;
		this.soldNum = soldNum;
		this.stockNum = stockNum;
	}
	
	//생성자 오버로딩 = 오버로드 == 똑같은 이름의 생성자를 여러 개 만들 수 있다
	public Goods() {
		this.name =name;
		this.code = code;
		this.soldNum = soldNum;
		this.stockNum = stockNum;
	}

	//g1.name 이렇게 하는 것보다,,, << 게터 세터 메서드 만들어서 하는 게 ★표준 코드★
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getSoldNum() {
		return soldNum;
	}

	public void setSoldNum(int soldNum) {
		this.soldNum = soldNum;
	}

	public int getStockNum() {
		return stockNum;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	
	
}
