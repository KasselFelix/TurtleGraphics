package pobj.tme6;

public class CommandSetColor implements ICommand {
	
	private Color color;
	public CommandSetColor(Color color){
		this.color=color;
	}
	
	@Override
	public void execute(IColorTurtle turtle) {
		turtle.setColor(color);
	}

}
