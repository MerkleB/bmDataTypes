package bmDataTypes;

public class DT_MusicalSymbol {
	private EN_MusicalSymbolName name;
	private int quantity;
	private int positionX;
	private int positionY;
	private boolean hasPunctuation;
	private boolean vorzeichen;
	private int beatNumerator;
	private int beatDenumerator;
	
	public DT_MusicalSymbol(EN_MusicalSymbolName SymbolName){
		name = SymbolName;
	}
	
	public EN_MusicalSymbolName getName(){
		return this.name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(this.name == EN_MusicalSymbolName.B || this.name == EN_MusicalSymbolName.Kreuz){
			this.quantity = quantity;
		}else{
			//Error handling
		}
	}

	public int[] getPosition() {
		int[] array = {positionX, positionY};
		return array;
	}

	public void setPosition(int positionX, int positionY) {
		if (this.name == EN_MusicalSymbolName.Note 
			|| this.name == EN_MusicalSymbolName.GanzeNote
			|| this.name == EN_MusicalSymbolName.HalbeNote
			|| this.name == EN_MusicalSymbolName.ViertelNote
			|| this.name == EN_MusicalSymbolName.AchtelNote
			|| this.name == EN_MusicalSymbolName.SechzehntelNote)
		{
			this.positionX = positionX;
			this.positionY = positionY;
		}else{
			//Error handling
		}
	}

	public boolean isHasPunctuation() {
		return hasPunctuation;
	}

	public void setHasPunctuation(boolean hasPunctuation) {
		if (this.name == EN_MusicalSymbolName.Note 
				|| this.name == EN_MusicalSymbolName.GanzeNote
				|| this.name == EN_MusicalSymbolName.HalbeNote
				|| this.name == EN_MusicalSymbolName.ViertelNote
				|| this.name == EN_MusicalSymbolName.AchtelNote
				|| this.name == EN_MusicalSymbolName.SechzehntelNote)
			{
				this.hasPunctuation = hasPunctuation;
			}else{
				//Error handling
			}
	}

	public boolean isVorzeichen() {
		return vorzeichen;
	}

	public void setVorzeichen(boolean vorzeichen) {
		if (this.name == EN_MusicalSymbolName.Note 
				|| this.name == EN_MusicalSymbolName.GanzeNote
				|| this.name == EN_MusicalSymbolName.HalbeNote
				|| this.name == EN_MusicalSymbolName.ViertelNote
				|| this.name == EN_MusicalSymbolName.AchtelNote
				|| this.name == EN_MusicalSymbolName.SechzehntelNote)
			{
				this.vorzeichen = vorzeichen;
			}else{
				//Error handling
			}
	}

	public int getBeatNumerator() {
		return beatNumerator;
	}

	public void setBeatNumerator(int beatNumerator) {
		if (this.name == EN_MusicalSymbolName.Takt){
			this.beatNumerator = beatNumerator;
		}else{
			//Error handling
		}
	}

	public int getBeatDenumerator() {
		return beatDenumerator;
	}

	public void setBeatDenumerator(int beatDenumerator) {
		if (this.name == EN_MusicalSymbolName.Takt){
			this.beatDenumerator = beatDenumerator;
		}else{
			//Error handling
		}
	}
	
	
}
