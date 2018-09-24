package bmDataTypes;

public class DT_Point {
	private int x;
	private int y;
	
	public DT_Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public boolean equals(DT_Point checkPoint){
		if( x == checkPoint.getX() && y == checkPoint.getY()){
			return true;
		}else{
			return false;
		}
	}
}
