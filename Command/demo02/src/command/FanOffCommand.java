package command;

import receiver.Fan;
/**
 * 
 * @author ctyFL
 * 命令-关闭
 */
public class FanOffCommand extends FanCommand {
	
	public FanOffCommand(Fan fan) {
		super(fan);
	}
	
	@Override
	public void execute() {
		speed = fan.getSpeed();
		fan.off();
	}
	
}
