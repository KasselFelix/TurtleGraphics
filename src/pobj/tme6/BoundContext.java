package pobj.tme6;

public class BoundContext extends ColorTurtle implements IContext {
	
	private int minX=Integer.MAX_VALUE;
	private int minY=Integer.MAX_VALUE;
	private int maxX=0;
	private int maxY=0;
	
	public BoundContext () {
		super();
	}
	
	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		if(x1<minX ) 
			minX=x1;
		if (y1<minY)
			minY=y1;
		if(x2<minX) 
			minX=x2;
		if(y2<minY)
			minY=y2;
		if(x1>maxX ) 
			maxX=x1;
		if(y1>maxY)
			maxY=y1;
		if(x2>maxX )
			maxX=x2;
		if(y2>maxY)
			maxY=y2;
	}
	
	public int getMinX() {
		return minX;
	}
	
	public int getMinY() {
		return minY;
		
	}
	public int getMaxX() {
		return maxX;
		
	}
	public int getMaxY() {
		return maxY;
	}
	
}
