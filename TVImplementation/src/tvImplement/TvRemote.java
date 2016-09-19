package tvImplement;

public class TvRemote implements ITV {

	ITV tv;
	public TvRemote() {
		this.tv = tv;
	}
	
	@Override
	public void on() {
		tv.on();
	}

	@Override
	public void off() {
		tv.off();
	}

	@Override
	public void changeChannel(int channel_no) {
		tv.changeChannel(channel_no);	
	}

	@Override
	public void setVolume(int volume) {
		tv.setVolume(volume);
	}
	
}
