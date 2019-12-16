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
		//channel 변수의 값을 1 증가시킴, 10 보다 커지면 1 로 설정한다.
		channel = channel > 10 ? ++channel : 1;		
	}
	public void channelDown() {
		//channel 변수의 값을 1 감소시킴, 1보다 작아지면 10으로 설정한다.
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
