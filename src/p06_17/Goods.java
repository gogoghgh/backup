package p06_17;

public class Goods {
	private String name;
	private String code;
	private int soldNum;
	private int stockNum;
	
	//������ �����.. �����ϱ�...
	//�����ڿ��� �Է¹��� ������ �⺯�� �־��ִ� �� �ִ� �� �� ����!!!!!!
	//������ �ϴ� ��: �Ű����� name�� -> ��������� �־ '�ʱⰪ' �����ϴ°�!!! �ڡ�
	public Goods(String name, String code, int soldNum, int stockNum) {
		//System.out.println(name + "(�ڵ��ȣ: " + code + "), �ȸ� ����: " + soldNum + ", ��� ����: " + stockNum);
		this.name =name;
		this.code = code;
		this.soldNum = soldNum;
		this.stockNum = stockNum;
	}
	
	//������ �����ε� = �����ε� == �Ȱ��� �̸��� �����ڸ� ���� �� ���� �� �ִ�
	public Goods() {
		this.name =name;
		this.code = code;
		this.soldNum = soldNum;
		this.stockNum = stockNum;
	}

	//g1.name �̷��� �ϴ� �ͺ���,,, << ���� ���� �޼��� ���� �ϴ� �� ��ǥ�� �ڵ��
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
