package pobj.tme6;

public class SaveTurtleSub extends SaveTurtle {
	private ICommand subst;
	
	public SaveTurtleSub(ICommand subst) {
		super();
		this.subst=subst;
	}
	
	@Override
	public void move(int length) {
		this.getCommand().addCommand(subst);
	}

}
