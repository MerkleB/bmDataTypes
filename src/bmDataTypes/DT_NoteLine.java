package bmDataTypes;
import java.util.ArrayList;

public class DT_NoteLine {
	private DT_MusicalSymbol NotenSchluessel;
	private DT_MusicalSymbol Vorzeichen;
	private DT_MusicalSymbol Takt;
	private ArrayList<DT_MusicalSymbol> Symbole;
	public DT_MusicalSymbol getNotenSchluessel() {
		return NotenSchluessel;
	}
	public void setNotenSchluessel(DT_MusicalSymbol notenSchluessel) {
		if(notenSchluessel.getName() == EN_MusicalSymbolName.ViolinSchluessel 
				|| notenSchluessel.getName() == EN_MusicalSymbolName.BratscheSchluessel
				|| notenSchluessel.getName() == EN_MusicalSymbolName.BassSchluessel){
			NotenSchluessel = notenSchluessel;
		}else{
			//error handling
		}
	}
	public DT_MusicalSymbol getVorzeichen() {
		return Vorzeichen;
	}
	public void setVorzeichen(DT_MusicalSymbol vorzeichen) {
		if(vorzeichen.getName() == EN_MusicalSymbolName.B || vorzeichen.getName() == EN_MusicalSymbolName.Kreuz){
			Vorzeichen = vorzeichen;
		}else{
			//error handling
		}
	}
	public DT_MusicalSymbol getTakt() {
		return Takt;
	}
	public void setTakt(DT_MusicalSymbol takt) {
		if(takt.getName() == EN_MusicalSymbolName.Takt){
			Takt = takt;
		}else{
			//error handling
		}
	}
	public ArrayList<DT_MusicalSymbol> getSymbole() {
		return Symbole;
	}
	public void addSymbol(DT_MusicalSymbol symbol) {
		this.Symbole.add(symbol);
	}
	
	
}
