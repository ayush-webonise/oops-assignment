package tvImplement;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITV itv = new LCD_TV();
		itv.off();
		itv.on();
		itv.changeChannel(403);
		itv.setVolume(12);
	}

}
