package command;
/**
 * 
 * @author ctyFL
 * 命令-坦克部队进攻
 */

import receiver.TankGeneral;

public class TankAttackCommand implements Command {

	TankGeneral tankGeneral;
	
	public TankAttackCommand(TankGeneral tankGeneral) {
		this.tankGeneral = tankGeneral;
	}
	
	@Override
	public void execute() {
		tankGeneral.orderUp();
		tankGeneral.interspersedWithSplit();
		tankGeneral.furtherAttacks();
	}
	
}
