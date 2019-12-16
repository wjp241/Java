package rent;

public class RentalTV  extends TV implements Rentable {
	private int price;
	public RentalTV() {};
	public RentalTV(int price, String model, int size, int channel) {
		super(model,size,channel);
		this.price = price;
	}
	public void play() {
		System.out.printf("%s���� ��ǰ�� �뿩�մϴ�. %,d �� ������ �ּ���.\n", this.getModel(), this.getPrice());
	}
	public void rent() {
		System.out.printf("�뿩 TV ä�� %d���� ���θ� �÷��� �մϴ�.\n", this.getChannel());
	}
	public int getPrice() {
		return this.price;
	}
	public String toString() {
		return String.format("���뿩��ǰ���� : �𵨸�(%s), ����(%,d��), ũ��(%d)", this.getModel(),this.getPrice() ,this.getSize());
	}
	
}
