package bmDataTypes;
import java.util.ArrayList;

public class DT_NoteSystem {
	private int numberOfLines;
	private ArrayList<DT_NoteLine> NoteLines;
	
	public DT_NoteSystem(){
		this.numberOfLines = 0;
	}
	
	public void addNoteLine(DT_NoteLine noteLine){
		NoteLines.add(noteLine);
		numberOfLines++;
	}
	
	public int getNumberOfLines(){
		return this.numberOfLines;
	}
}
