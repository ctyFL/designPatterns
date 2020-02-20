package command;
/**
 * 
 * @author ctyFL
 * 命令-什么都不做，用作默认设置
 */
public class DoNothingCommand implements Command {

	@Override
	public void execute() {
		
	}
	
	@Override
	public void undo() {
		
	}
	
}
