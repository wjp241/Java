package day7;

public class MyTv {

		boolean isPowerOn;
		int channel;
		int volume;
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		final int MAX_CHANNEL = 100;
		final int MIN_CHANNEL = 1;
		void turnOnOff() {
		// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
			this.isPowerOn  = !this.isPowerOn; 
		
	}
		void volumeUp() {
			// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
			if(volume < this.MAX_VOLUME) {
				volume += 1;
			}
			}
			void volumeDown() {
			// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
				if(this.volume > this.MIN_VOLUME) {
					this.volume -= 1;
				}
			}
			void channelUp() {
			// (4) channel�� ���� 1������Ų��.
				System.out.print(this.channel);
				this.channel  += 1;
				System.out.print(this.channel);

			// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
				if(this.channel == this.MAX_CHANNEL) {
					this.channel = this.MIN_CHANNEL;
				}
			}
			void channelDown() {
			// (5) channel�� ���� 1���ҽ�Ų��.
				this.channel --;
				
			// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
				if(this.channel == this.MIN_CHANNEL) {
					this.channel =this. MAX_CHANNEL;
				}
			}

}
