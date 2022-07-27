package pobj.tme6;
import java.util.ArrayList;
import java.util.List;

public class CommandList implements ICommand {
	
	private List<ICommand> commands=new ArrayList<ICommand>();
	
	public void addCommand(ICommand command) {
		commands.add(command);
	}
	
	@Override
	public void execute(IColorTurtle turtle) {
		for(ICommand c : commands) {
			c.execute(turtle);
		}
	}

}
