
public class Singleton {
	private static Singleton uniqueInstance;
	private Singleton() {}
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public String getDesc() {
		return "I am a singleton !";
	}

}
