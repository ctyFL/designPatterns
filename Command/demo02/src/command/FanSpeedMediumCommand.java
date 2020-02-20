package command;

import receiver.Fan;
/**
 * 
 * @author ctyFL
 * 命令-风速中速
 */
public class FanSpeedMediumCommand extends FanCommand {

	public FanSpeedMediumCommand(Fan fan) {
		super(fan);
	}
	
	@Override
	public void execute() {
		speed = fan.getSpeed();
		fan.setSpeedMedium();
	}
	
}
