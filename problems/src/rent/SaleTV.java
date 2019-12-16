package rent;

public class SaleTV extends TV {
	private int price;
	public SaleTV(){};
	public SaleTV(int price, String model, int size, int channel){
		super(model,size,channel);
		this.price = price;
	}
	public void play() {
		System.out.printf("�Ǹ� TV ä�� %d���� ���θ� �÷��� �մϴ�.\n", this.getChannel());
	}
	public void sale() {
		System.out.printf("%s���� ��ǰ�� �Ǹ��մϴ�. %,d �� ������ �ּ���.\n", this.getModel(), this.getPrice());

	}
	public int getPrice() {
		return this.price;
	}
	public String toString() {
		return  String.format("�ǸŻ�ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)", this.getModel(), this.getPrice(),this.getSize());
	}
}
