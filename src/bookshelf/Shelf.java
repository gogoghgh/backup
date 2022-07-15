package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; //자료를 순서대로 저장할 ArrayList  shelf 참조변수 선언
	
	//생성자
	public Shelf() {
		shelf = new ArrayList<String>(); 
	}  // 디폴트 생성자,, Shelf 클래스를 생성하면 -> ArrayList도 생성됨
	
	
	//메서드
	public ArrayList<String> getShelf(){ //리턴타입: ArrayList<String>
		return shelf;  //참조변수 shelf 는 ArrayList니까,, 리턴타입이랑 리턴값이랑 같음
	}
	
	public int getCount() {
		return shelf.size();
	}
}
