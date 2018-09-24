package bmDataTypes;

import java.util.ArrayList;

public class DT_PointCloud {
	private ArrayList<DT_Point> listOfPoints;
	private int minX, maxX, minY, maxY;
	
	public DT_PointCloud(ArrayList<DT_Point> points, int minX, int maxX, int minY, int maxY){
		listOfPoints = points;
		this.minX = minX;
		this.maxX = maxX;
		this.minY = minY;
		this.maxY = maxY;
	}

	public ArrayList<DT_Point> getListOfPoints() {
		return listOfPoints;
	}

	public int getMinX() {
		return minX;
	}

	public int getMinY() {
		return minY;
	}

	public int getMaxY() {
		return maxY;
	}

	public int getMaxX() {
		return maxX;
	}
}
