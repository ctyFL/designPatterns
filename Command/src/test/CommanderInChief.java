package text;
/**
 * 
 * @author ctyFL
 * 总司令
 */

import command.AirForceAttackCommand;
import command.Command;
import command.InfantryAttackCommand;
import command.NavalAttackCommand;
import command.TankAttackCommand;
import invoker.Aide;
import receiver.AirForceGeneral;
import receiver.InfantryGeneral;
import receiver.NavyGeneral;
import receiver.TankGeneral;

public class CommanderInChief {
	
	public static void main(String[] args) {
		
		System.out.println("总司令下令-空军攻击");
		AirForceGeneral airForceGeneral = new AirForceGeneral();
		Command command = new AirForceAttackCommand(airForceGeneral);
		Aide aide = new Aide(command);
		aide.conveyOrder();
		
		System.out.println("");
		
		System.out.println("总司令下令-海军攻击");
		NavyGeneral navyGeneral = new NavyGeneral();
		command = new NavalAttackCommand(navyGeneral);
		aide = new Aide(command);
		aide.conveyOrder();
		
		System.out.println("");
		
		System.out.println("总司令下令-坦克部队攻击");
		TankGeneral tankGeneral = new TankGeneral();
		command = new TankAttackCommand(tankGeneral);
		aide = new Aide(command);
		aide.conveyOrder();
		
		System.out.println("");
		
		System.out.println("总司令下令-步兵攻击");
		InfantryGeneral infantryGeneral = new InfantryGeneral();
		command = new InfantryAttackCommand(infantryGeneral);
		aide = new Aide(command);
		aide.conveyOrder();
	}

}
