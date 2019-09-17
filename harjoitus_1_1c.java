package harjoitus_1_1;

public class harjoitus_1_1c {

	public static void main(String[] args) {
		System.out.println(koostuuIsoistaKirjaimista("ÄÖÅ-"));
		System.out.println(koostuuIsoistaKirjaimista("Ä"));
	}
	
	/**
	 * Palauttaa true, jos parametri koostuu isoista kirjaimista mukaan lukien Ä, Ö, Å ja '-'.
	 * @.pre str != null
	 * @.post FORALL(char : String; char >= 65 && char <= 90 || char == 196 ||
	 * char == 197 || char == 214 || char == 153) 
	 */
	
	
	public static boolean koostuuIsoistaKirjaimista(String str) {
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if (c > 90 && c != 196 && c != 197 && c != 214 && c != 45) {
				return false;
			}
		}
		return true;
	}

}
