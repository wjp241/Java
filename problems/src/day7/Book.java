package day7;

class Hello {
	static int bye = 5;
	Hello(){
	}
	Hello(int num) {
		System.out.println("a;sldkfja;lsdkfjsad;lfkj");
		bye = num;
	}
}
public class Book extends Hello {

	String title;
	String author;
	int price;
	
	Book(String title, String author, int price){
		super(5);
		this.title = title;
		this.author = author;
		this.price = price;
	}
	

	Book(){
//		this.title = "�ڹ��� ����";
//		this.author = "���ü�";
//		this.price = 30000;\
		this("�ڹ��� ����", "���ü�", 30000);

	}
	
	String getBookInfo(){
		return this.title + " \n"+  this.author + " \n" + this.price;
	}
	
	void printBookInfo() {
		System.out.println(this.getBookInfo());
	}

}
