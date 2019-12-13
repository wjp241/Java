package day9;

public class Book {

	String title;
	String author;
	int price;
	
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	Book(){
//		this.title = "자바의 정석";
//		this.author = "남궁성";
//		this.price = 30000;
		this("자바의 정석", "남궁성", 30000);
	}
	
	String getBookInfo(){
		return this.title + " \n"+  this.author + " \n" + this.price;
	}
	
	void printBookInfo() {
		System.out.println(this.getBookInfo());
	}

}
