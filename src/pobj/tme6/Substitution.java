package pobj.tme6;

public class Substitution {
	static public ICommand substitute(ICommand org, ICommand subst) {
		SaveTurtleSub sts= new SaveTurtleSub(subst);
		org.execute(sts);
		return sts.getCommand();
	}
}
