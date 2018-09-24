package bmDataTypes;

import ErrorHandling.EN_ErrorCategory;

public class DT_Message {
	private int Number;
	private String Text;
	private	EN_ErrorCategory Category;
	
	public DT_Message(int number, String text){
		this.Number = number;
		this.Text = text;
	}
	
	public DT_Message(int number, String text, EN_ErrorCategory category){
		this.Number = number;
		this.Text = text;
		this.Category = category;
	}

	public EN_ErrorCategory getCategory() {
		return Category;
	}

	public void setCategory(EN_ErrorCategory category) {
		Category = category;
	}

	public int getNumber() {
		return Number;
	}

	public String getText(String par1, String par2, String par3) {
		return Text;
	}
	
	
	
}
