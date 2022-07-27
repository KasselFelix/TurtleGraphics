package pobj.tme6;

public class PrintContext extends ColorTurtle implements IContext {

	public PrintContext() {
		super();
	}
	
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		System.out.print(x1+" "+y1+" "+x2+" "+y2+" "+color+"\n");
	}
	
}
