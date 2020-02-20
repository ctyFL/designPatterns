package command;

import receiver.Fan;
/**
 * 
 * @author ctyFL
 * 命令-风扇打开
 */
public class FanOnCommand extends FanCommand {

	public FanOnCommand(Fan fan) {
		super(fan);
	}
	
	@Override
	public void execute() {
		speed = fan.getSpeed();
		fan.on();
	}
	
}
