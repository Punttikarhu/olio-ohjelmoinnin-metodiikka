package harjoitus_1_2;

public class harjoitus_1_2a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean nousevastiLajiteltuTaulukko(int[] t) {
		for (int i = 0; i < t.length-1; i++) {
			if(t[i+1] < t[i]) {
				return false;
			}
		}
		return true;
	}

}
