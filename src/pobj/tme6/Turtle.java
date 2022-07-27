package pobj.tme6;


public class Turtle implements ITurtle {
	private int x=0;
	private int y=0;
	private int angle=0;
	private boolean estLeve=false; 
	
	
	public void move(int length) {
		int oldX=x;
		int oldY=y;
		this.x= oldX + (int)(length * Math.sin(angle * Math.PI / 180.));
		this.y= oldY + (int)(length * Math.cos(angle * Math.PI / 180.));
		if(!estLeve)
			draw(oldX,oldY,x,y);
	}
	
	public boolean isEstLeve() {
		return estLeve;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void draw(int x1, int y1, int x2, int y2){
		System.out.print(x1+" "+y1+" "+x2+" "+y2+"\n");
	}

	@Override
	public void turn(int angle) {
		this.angle+=angle;
	}

	@Override
	public void up() {
		estLeve=true;
		
	}

	@Override
	public void down() {
		estLeve=false;
		
	}
	
}