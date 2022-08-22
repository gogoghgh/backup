package exam;

public class Book {
	private String title;
	private String author;
	private String publish;
	private int price;

	
	// »ý¼ºÀÚ
	public Book(String title, String author, String publish, int price) {
		super();
		this.title = title;
		this.author = author;
		this.publish = publish;
		this.price = price;
	}
	
	public Book() {}

	
	// get set
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublish() {
		return publish;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}