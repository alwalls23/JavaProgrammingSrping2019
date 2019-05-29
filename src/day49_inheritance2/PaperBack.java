package day49_inheritance2;

public class PaperBack extends Book{
	private int pages;
	
	public String toString () {
		return getTitle()+ " | "+getAuthor()+" | $"+getPrice()+" | "+getType()+ " | "+pages;
	}
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
}
