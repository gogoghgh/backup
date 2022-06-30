package p06.p06_24;

public class CardCompany {
	// step 2. static���� ������ �ν��Ͻ� �ϳ� ����
	private static CardCompany cardCompany = new CardCompany();

	
	// step 1. private�ϰ� ������ �����
	private CardCompany() {	}

	
	// step 3. �޼��� ����,, 
	// 			�ܺο��� ������ �� �ִ� public �޼���
	// 			����Ÿ���� CardCompany class��... 
	//			�޼��� �̸��� �� getInstance��!!!
	// 			static ��!! �ֳĸ� ��ü ���� ���� �� �Ŵϱ�,,,,,
	public static CardCompany getInstance() {
		return cardCompany; // cardCompany = new CardCompny�� ������ ����,, ��������
	}
	
	
	// step 4. ������ ����ϴ� �ڵ� �����
	// 			����Ÿ���� Card class!!!!!�� �޼���
	Card createCard() {
		return new Card(); //Card class Ÿ���� ����? new Card() �ϱ�..
	}
}
