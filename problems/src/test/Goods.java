package test;

public class Goods {
	String prodId; // ��ǰ ���̵�
	String prodName; // ��ǰ �̸�
	int price; // ��ǰ ����
	char asYn; // AS ���� ����

// ������ �� ���� �����Ͻÿ�. 
	Goods(String prodId, String prodName, int price, char asYn) {
		this(prodId, prodName, price);
		this.asYn = asYn;
	}

	Goods(String prodId, String prodName, int price) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		
	}
	
	// getGoodsInfo() �޼��带 �����Ͻÿ�.
		String getGoodsInfo(){
			return "��ǰID : " + this.prodId +  ", ��ǰ�� : " + this.prodName + ", ���� : " + this.price + ", AS���ɿ��� : " + (this.asYn == 'N'? "�Ұ�":"����");

		}
		
}
