package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //�ڷḦ ������� ������ ArrayList  shelf �������� ����
	
	//������
	public Shelf() {
		shelf = new ArrayList<String>(); 
	}  // ����Ʈ ������,, Shelf Ŭ������ �����ϸ� -> ArrayList�� ������
	
	
	//�޼���
	public ArrayList<String> getShelf(){ //����Ÿ��: ArrayList<String>
		return shelf;  //�������� shelf �� ArrayList�ϱ�,, ����Ÿ���̶� ���ϰ��̶� ����
	}
	
	public int getCount() {
		return shelf.size();
	}
}
