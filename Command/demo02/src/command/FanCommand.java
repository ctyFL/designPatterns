package command;
/**
 * 
 * @author ctyFL
 * 命令-风扇
 */

import receiver.Fan;

public class FanCommand implements Command {

	protected Fan fan;
	protected int speed;
	
	public FanCommand(Fan fan) {
		this.fan = fan;
	}
	
	@Override
	public void execute() {
		
	}
	
	@Override
	public void undo() {
		if(speed == Fan.HIGH) {
			fan.setSpeedHigh();
		}else if(speed == Fan.MEDIUM) {
			fan.setSpeedMedium();
		}else if(speed == Fan.LOW) {
			fan.setSpeedLow();
		}else if(speed == Fan.OFF) {
			fan.off();
		}
	}
	
}
