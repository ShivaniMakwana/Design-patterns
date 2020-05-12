
public class LG  extends TV{
	int station = 0;
	public void on() {
		System.out.println("Tuning on the LG TV");
	}
	public void off() {
		System.out.println("Tuning off the LG TV");
	}
	public void tuneChannel(int channel) {
		this.station = channel;
		System.out.println("Tuning set to : "+ this.station);
	}
	public int getChannel() {
		return this.station;
	}

}