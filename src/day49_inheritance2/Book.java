package day49_inheritance2;

public class Book {

	private String title;
	private String type;
	private String Author;
	double price;

	public String toString() {
		return "Book [title=" + title + ", type=" + type + ", Author=" + Author + ", price=" + price + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
