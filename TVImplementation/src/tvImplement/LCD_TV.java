package tvImplement;

public class LCD_TV extends TV implements ITV{

	int channel_no;
	int volume;
	int power_status;
	
	public LCD_TV()
	{
		channel_no = 117;
		volume = 26;
		power_status = 0;
		model_no = 14314;
		size = 42;
		model_type = "LCD";
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		this.power_status = 1;
		System.out.println("TV is turned ON now!");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		this.power_status = 0;
		System.out.println("TV is turned OFF now!");
	}

	@Override
	public void changeChannel(int channel_no) {
		// TODO Auto-generated method stub
		this.channel_no = channel_no;
		System.out.println("Switched to channel no. "+ channel_no);
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
		System.out.println("Currently volume of TV is: "+ volume);
	}
	
}
