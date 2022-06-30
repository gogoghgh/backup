package p06.p06_14;

public class OrderTest {

	public static void main(String[] args) {
		Order o1 = new Order();

		o1.setOrderNum("201803120001"); // long으로 했는데 빨간줄,, 넘 길어서~~ 그래용 String으로 바꿈
		o1.setMemberID("abc123");
		o1.setOrderDate("2018년 3월 12일");
		o1.setMemberName("홍길순");
		o1.setProductID("PD0345-12");
		o1.setAddress("서울시 영등포구 여의도동 20번지");

		System.out.println("주문번호: " + o1.getOrderNum());
		System.out.println("주문자 아이디: " + o1.getMemberID());
		System.out.println("주문 날짜: " + o1.getOrderDate());
		System.out.println("주문자 이름: " + o1.getMemberName());
		System.out.println("주문 상품 번호: " + o1.getProductID());
		System.out.println("배송 주소: " + o1.getAddress());

	}

}
