package day49_inheritance2;

public class BarnesAndNobles {
	public static void main(String[] args) {

		EBook ebook = new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setType("Tech Book");
		// BREAK TILL 4:45 PM
		System.out.println(ebook.getTitle());
		System.out.println(ebook.getAuthor());
		ebook.readEBook(10);
		ebook.readEBook(621);
		
		System.out.println("================================================");
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA preperation");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		aBook.listen();
		
		System.out.println("==================================================");
		
		PaperBack pb = new PaperBack();
		pb.setAuthor("Malcom Gladwell");
		pb.setTitle("Outliers");
		pb.setType("Biography");
		pb.setPrice(20);
		pb.setPages(500);
		pb.toString();
		

	}
}
