package command;
/**
 * 
 * @author ctyFL
 * 命令-空军进攻
 */

import receiver.AirForceGeneral;

public class AirForceAttackCommand implements Command {

	AirForceGeneral airForceGeneral;
	
	public AirForceAttackCommand(AirForceGeneral airForceGeneral) {
		this.airForceGeneral = airForceGeneral;
	}
	
	@Override
	public void execute() {
		airForceGeneral.orderUp();
		airForceGeneral.stealthDroneReconnaissance();
		airForceGeneral.stealthDroneStrikes();
		airForceGeneral.fighterFourDimensionalSaturationStrike();
	}
	
}
