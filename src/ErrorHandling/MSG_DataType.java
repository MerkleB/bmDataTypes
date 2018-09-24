package ErrorHandling;

import bmDataTypes.DT_Message;
import java.util.ArrayList;

public class MSG_DataType {
	private static final String[] con_Messages = 
	{
		"$1: Das Setzen des Attributs Quantity ist nur für Vorzeichen erlaubt"
		,"$1: Das Setzen einer Position ist nur für Noten erlaubt"
		,"$1: Das Setzen einer Punktierung ist nur für Noten erlaubt"
		,"$1: Das Setzen eines Vorzeichens ist nur für Noten erlaubt"
		,"$1: Das Setzen eines Nenners ist nur für Taktanzeiger erlaubt"
		,"$1: Das Setzen eines Zählers ist nur für Taktanzeiger erlaubt"
	};
	
	private ArrayList<DT_Message> messages;
	
	public MSG_DataType(){
		for(int i=0; i<this.con_Messages.length; i++){
			messages.add(new DT_Message(i, this.con_Messages[i]));
		}
	}
	
}
