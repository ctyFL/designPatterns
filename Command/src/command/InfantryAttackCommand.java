package command;
/**
 * 
 * @author ctyFL
 * 命令-步兵进攻
 */

import receiver.InfantryGeneral;

public class InfantryAttackCommand implements Command {

	InfantryGeneral infantryGeneral;
	
	public InfantryAttackCommand(InfantryGeneral infantryGeneral) {
		this.infantryGeneral = infantryGeneral;
	}
	
	@Override
	public void execute() {
		infantryGeneral.orderUp();
		infantryGeneral.lineUpInTriangleAndFire();
	}
	
}
