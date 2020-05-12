
public class Sony extends TV{
	int station = 0;
	public void on() {
		System.out.println("Tuning on the Sony TV");
	}
	public void off() {
		System.out.println("Tuning off the Sony TV");
	}
	public void tuneChannel(int channel) {
		this.station = channel;
		System.out.println("Tuning set to : "+ this.station);
	}
	public int getChannel() {
		return this.station;
	}

}
