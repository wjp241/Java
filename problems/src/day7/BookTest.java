package day7;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book("bookA", "authorA", 1000);
		book1.printBookInfo();
		Book book2 = new Book("bookB", "authorB", 2000);
		book2.printBookInfo();
		Book book3 = new Book("bookC", "authorC", 3000);
		book3.printBookInfo();
		Book book4 = new Book("bookD", "authorD", 4000);
		book4.printBookInfo();
		Book book5 = new Book("bookE", "authorE", 5000);
		book5.printBookInfo();
		Book book6 = new Book();
		book6.printBookInfo();

	}

}
