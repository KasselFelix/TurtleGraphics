package pobj.tme6;

public class ColorTurtle extends Turtle implements IColorTurtle {
	private Color color = Color.BLACK;
	
	public ColorTurtle(){
		super();
	}
	
	@Override
	public void setColor(Color color) {
		this.color=color;
		
	}
	
	@Override
	public void draw(int x1, int y1, int x2, int y2){
		System.out.print(x1+" "+y1+" "+x2+" "+y2+" "+color+"\n");
	}

	public Color getColor() {
		return color;
	}
}
