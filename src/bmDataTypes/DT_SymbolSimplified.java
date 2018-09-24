package bmDataTypes;

public class DT_SymbolSimplified {
	private EN_MusicalSymbolName name;
	private double commonX;
	private double commonY;
	
	public DT_SymbolSimplified(EN_MusicalSymbolName name, double x, double y) {
		this.name = name;
		this.commonX = x;
		this.commonY = y;
	}
	
	public double[] getPosition(){
		double[] position = {this.commonX, this.commonY};
		return position;
	}
	
	public EN_MusicalSymbolName getName(){
		return this.name;
	}

	@Override
	public String toString() {
		return name.name() + ";" + commonX+ ";" + commonY;
	}
	
	public boolean equalsToSymbol(DT_SymbolSimplified symbol){
		if(name == symbol.getName() 
				&& commonX == symbol.getPosition()[0] 
				&& commonY == symbol.getPosition()[1]){
			return true;
		}else return false;
	}
	
	
}
