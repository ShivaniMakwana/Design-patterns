
public class Client {

	public static void main(String[] args) {
		TVFactory tvFactory = new TVFactory();
		SpecialRemote sonyRemote = new SpecialRemote(tvFactory);
		System.out.println("connect remote to sony");
		sonyRemote.setTV("Sony");
		sonyRemote.on();
		sonyRemote.up();
		sonyRemote.down();
		sonyRemote.off();
		
		GenericRemote remoteLG = new GenericRemote(tvFactory);
		System.out.println("connect remote to LG");
		remoteLG.setTV("LG");
		remoteLG.on();
		remoteLG.nextChannel();
		remoteLG.prevChannel();
		remoteLG.off();
	}

}
