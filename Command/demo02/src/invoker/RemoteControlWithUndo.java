package invoker;
/**
 * 
 * @author ctyFL
 * 遥控器-8个按钮 2组开关 3挡电扇风速按钮 1个撤销
 */

import command.Command;
import command.DoNothingCommand;

public class RemoteControlWithUndo {

	Command[] onCommands; //2个开启按钮
	Command[] offCommands; //2个关闭按钮
	Command[] gearCommands; //3个挡位按钮
	Command undoCommand; //1个撤销按钮
	
	public RemoteControlWithUndo() {
		onCommands = new Command[2];
		offCommands = new Command[2];
		gearCommands = new Command[3];
		
		Command doNothingCommand = new DoNothingCommand();
		for(int i = 0; i < 2; i++) {
			onCommands[i] = doNothingCommand;
			offCommands[i] = doNothingCommand;
		}
		for(int i = 0; i < 3; i++) {
			gearCommands[i] = doNothingCommand;
		}
		undoCommand = doNothingCommand;
	}
	
	public void setCommand(int index, Command onCommand, Command offCommand) {
		onCommands[index] = onCommand;
		offCommands[index] = offCommand;
	}
	
	public void setGearCommand(int index, Command gearCommand) {
		gearCommands[index] = gearCommand;
	}
	
	public void pressButtonOn(int index) {
		onCommands[index].execute();
		undoCommand = onCommands[index];
	}
	
	public void pressButtonOff(int index) {
		offCommands[index].execute();
		undoCommand = offCommands[index];
	}
	
	public void pressButtonGear(int index) {
		gearCommands[index].execute();
		undoCommand = gearCommands[index];
	}
	
	public void pressButtonUndo() {
		undoCommand.undo();
	}
	
}
