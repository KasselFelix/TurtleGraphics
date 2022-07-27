package pobj.tme6;

public class ColorTurtleAdapter implements IColorTurtle {
	private ITurtle tortue;
	
	public ColorTurtleAdapter (ITurtle tortue) {
		this.tortue=tortue;
		
	}

	@Override
	public void move(int length) {
		tortue.move(length);
	}

	@Override
	public void turn(int angle) {
		tortue.turn(angle);
	}

	@Override
	public void up() {
		tortue.up();
	}

	@Override
	public void down() {
		tortue.down();
	}

	@Override
	public void setColor(Color color) {
		return;	
	}
	
}
