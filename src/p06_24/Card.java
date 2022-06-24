package p06_24;

public class Card {
	public static int serialNum = 0;
	int cardID;

	public Card() {
//		System.out.println(++serialNum);
		serialNum++;
		cardID = serialNum;
	}

}
