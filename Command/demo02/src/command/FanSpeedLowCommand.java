package command;

import receiver.Fan;

/**
 * 
 * @author ctyFL
 * 命令-风速低速
 */
public class FanSpeedLowCommand extends FanCommand {

	public FanSpeedLowCommand(Fan fan) {
		super(fan);
	}
	
	@Override
	public void execute() {
		speed = fan.getSpeed();
		fan.setSpeedLow();
	}
	
}
