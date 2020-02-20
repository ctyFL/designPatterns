package invoker;
/**
 * 
 * @author ctyFL
 * 副官
 */

import command.Command;

public class Aide {

	Command command;
	
	public Aide(Command command) {
		this.command = command;
	}
	
	/**
	 * 传达命令
	 */
	public void conveyOrder() {
		System.out.println("副官传达命令");
		command.execute();//执行命令
	}
	
}
