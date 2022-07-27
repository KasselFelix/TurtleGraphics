package pobj.tme6;

public class ContextTurtle extends ColorTurtle implements IColorTurtle {
	
	private IContext context;
	
	public ContextTurtle(IContext context) {
		super();
		this.context=context;
		
	}

//	@Override
//	public void move(int length) {
//		int oldX=getX();
//		int oldY=getY();
//		setX( oldX + (int)(length * Math.sin(getAngle() * Math.PI / 180.)));
//		setY( oldY + (int)(length * Math.cos(getAngle() * Math.PI / 180.)));
//		if(!isEstLeve())
//			context.drawLine(oldX,oldY,getX(),getY(),getColor());
//		
//	}
	
	@Override
	public void draw(int x1, int y1, int x2, int y2){
		context.drawLine(x1,y1,x2,y2,getColor());
	}


}
