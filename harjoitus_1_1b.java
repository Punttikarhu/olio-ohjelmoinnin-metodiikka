package harjoitus_1_1;

public class harjoitus_1_1b {

	public static void main(String[] args) {
		System.out.println(koostuuIsoistaKirjaimista("Asia"));
		System.out.println(koostuuIsoistaKirjaimista("AASIA"));
	}
	
	
	/**
	 * Palauttaa true, jos parametri koostuu isoista kirjaimista
	 * @.pre str != null
	 * @.post FORALL(char : String; char >= 65 AND char <= 90)
	 */
	
	public static boolean koostuuIsoistaKirjaimista(String str) {
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if (c > 90) {
				return false;
			}
		}
		return true;
	}

}
