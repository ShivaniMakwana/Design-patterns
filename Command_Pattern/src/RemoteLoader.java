
public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl remoteControl = new RemoteControl();
		TV tv = new TV("living room");
		TVOnCommand tvOn = new TVOnCommand(tv);
		TVOffCommand tvOff = new TVOffCommand(tv);
		remoteControl.setCommand(0, tvOn, tvOff);
		remoteControl.offButtonPushed(0);
		remoteControl.onButtonPushed(0);
		remoteControl.undoButtonPushed();
	}

}
