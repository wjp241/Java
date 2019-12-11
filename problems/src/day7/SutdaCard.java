package day7;

public class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	SutdaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	String info() {
		return "" + this.num + (isKwang==true? "K":""); 
	}
}
