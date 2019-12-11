package day7;

public class Product {
	String name;
	int balance;
	int price;
	
	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price= price;
	}
	
	Product(){
//		this.name = "µàÅ©ÀÎÇü";
//		this.balance = 5;
//		this.price = 10000;
		this("µàÅ©ÀÎÇü", 5, 10000);
	}
	
	String getName() {
		return this.name;
	}
	
	int getBalance() {
		return this.balance;
	}
	
	int getPrice() {
		return this.price;
	}
	
	void printInfo() {
		System.out.println(this.name + "\n" + this.balance + "\n" + this.price +" won");
	}



}
