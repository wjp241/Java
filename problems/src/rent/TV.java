package rent;

abstract public class TV {
	private String model;
	private int size;
	private int channel;
	public TV() {}
	public TV(String model, int size, int channel) {
		this.model = model;
		this.size = size;
		this.channel = channel;
	};
	public void channelUp() {
		//channel ������ ���� 1 ������Ŵ, 10 ���� Ŀ���� 1 �� �����Ѵ�.
		channel = channel > 10 ? ++channel : 1;		
	}
	public void channelDown() {
		//channel ������ ���� 1 ���ҽ�Ŵ, 1���� �۾����� 10���� �����Ѵ�.
		channel = channel < 1 ? 10: --channel;
	}
	public int getChannel(){
		return this.channel;
	};
	public void setChannel(int channel){
		this.channel = channel;
	};
	public int getSize() {
		return this.size;
	};
	public void setSize(int size) {
		this.size = size;
	};
	public String getModel() {
		return this.model;
	};
	public void setModel(String model) {
		this.model = model;
	};
	abstract public void play();
	abstract public int  getPrice();
}
