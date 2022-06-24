package p06_24;

public class CardTest {

	public static void main(String[] args) {
		CardCompany cc = CardCompany.getInstance();
		
//		Card c1 = new Card(); // serialNum++ 0 -> 1
//		Card c2 = new Card(); // serialNum++ ->2
//		Card c3 = new Card(); // serialNum++ ->3
//		Card c4 = new Card();
		
		Card c1 = cc.createCard(); //createCard �޼��� ����� ������ new Card()�� �������..
		Card c2 = cc.createCard();
		Card c3 = cc.createCard();
		
		// �׸� �� ���ּ�
		System.out.println("c1.serialNum: " + c1.serialNum + " / c1.cardID: " + c1.cardID);
		System.out.println("c2.serialNum: " + c2.serialNum + " / c2.cardID: " + c2.cardID);
		System.out.println("c3.serialNum: " + c3.serialNum + " / c3.cardID: " + c3.cardID);
		System.out.println(c2.serialNum);
		System.out.println(c3.serialNum);
		
	}

}
