package abstractEx.Computer;

public class ComTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();  abstract class�ϱ�~~ ��ü ���� ����
		DeskTop c2 = new DeskTop();
//		NoteBook c3 = new NoteBook();  �굵~~
		MyNoteBook c4 = new MyNoteBook();
		c2.display();
		c2.typing();
		c4.display();
		c4.typing();
	}

}
