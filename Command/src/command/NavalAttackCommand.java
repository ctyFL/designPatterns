package command;
/**
 * 
 * @author ctyFL
 * 命令-海军进攻
 */

import receiver.NavyGeneral;

public class NavalAttackCommand implements Command {

	NavyGeneral navyGeneral;
	
	public NavalAttackCommand(NavyGeneral navyGeneral) {
		this.navyGeneral = navyGeneral;
	}
	
	@Override
	public void execute() {
		navyGeneral.orderUp();
		navyGeneral.submarineTeamSafari();
		navyGeneral.battleshipShelling();
		navyGeneral.wingFlankSalvo();
	}
	
}
