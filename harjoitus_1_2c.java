package harjoitus_1_2;

public class harjoitus_1_2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	enum esine {
		KIVI,
		PAPERI,
		SAKSET
	}
	
	public static boolean vastapelaajaVoitti(esine e1, esine e2) {
		if (e1 == esine.KIVI && e2 == esine.PAPERI) {
			return true;
		} else {
			return false;
		}
	}

}
