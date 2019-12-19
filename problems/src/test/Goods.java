package test;

public class Goods {
	String prodId; // 상품 아이디
	String prodName; // 상품 이름
	int price; // 상품 가격
	char asYn; // AS 가능 여부

// 생성자 두 개를 구현하시오. 
	Goods(String prodId, String prodName, int price, char asYn) {
		this(prodId, prodName, price);
		this.asYn = asYn;
	}

	Goods(String prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		
	}
	
	// getGoodsInfo() 메서드를 구현하시오.
		String getGoodsInfo(){
			return "상품ID : " + this.prodId +  ", 상품명 : " + this.prodName + ", 가격 : " + this.price + ", AS가능여부 : " + (this.asYn == 'N'? "불가":"가능");

		}
		
}
