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
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
			this.isPowerOn  = !this.isPowerOn; 
		
	}
		void volumeUp() {
			// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
			if(volume < this.MAX_VOLUME) {
				volume += 1;
			}
			}
			void volumeDown() {
			// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
				if(this.volume > this.MIN_VOLUME) {
					this.volume -= 1;
				}
			}
			void channelUp() {
			// (4) channel의 값을 1증가시킨다.
				System.out.print(this.channel);
				this.channel  += 1;
				System.out.print(this.channel);

			// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
				if(this.channel == this.MAX_CHANNEL) {
					this.channel = this.MIN_CHANNEL;
				}
			}
			void channelDown() {
			// (5) channel의 값을 1감소시킨다.
				this.channel --;
				
			// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
				if(this.channel == this.MIN_CHANNEL) {
					this.channel =this. MAX_CHANNEL;
				}
			}

}
