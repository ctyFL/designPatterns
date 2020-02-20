package command;

import receiver.Fan;
/**
 * 
 * @author ctyFL
 * 命令-风速高速
 */
public class FanSpeedHighCommand extends FanCommand {
	
	public FanSpeedHighCommand(Fan fan) {
		super(fan);
	}
	
	@Override
	public void execute() {
		speed = fan.getSpeed();
		fan.setSpeedHigh();
	}
	
}
