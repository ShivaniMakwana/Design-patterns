//Invoker
public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	public void setCommand(int slot, Command onCommand, Command OffCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = OffCommand;
	}
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
		System.out.println(slot + ", on button pushed");
	}
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
		System.out.println(slot + ", off button pushed");
	}
	public void undoButtonPushed() {
		undoCommand.undo();
		System.out.println("Undo button is pressed");
	}
	
	public String tostring() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n-------remote control-------");
		for(int i =0; i<onCommands.length; i++) {
			sb.append("slot : "+i+" : "+ onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName());
		}
		return sb.toString();
	}
}
