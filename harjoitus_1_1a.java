package harjoitus_1_1;

import java.util.Scanner;

public class harjoitus_1_1a {

	public static void main(String[] args) {
		String nimi1 = kysyNimi();
		String nimi2 = kysyNimi();
		String pidempiNimi = pidempiNimi(nimi1, nimi2);
		if (pidempiNimi == null) {
			System.out.println("Nimet ovat yhtä pitkät.");
		} else {
			System.out.println("Pidempi nimi on " + pidempiNimi);
		}
	}
	
	/**
	 * Kysyy käyttäjältä nimen
	 * @.pre true
	 * @.post RESULT != null
	 */
	
	public static String kysyNimi() {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Syötä nimi: ");
		String nimi = lukija.next();
		return nimi;
	}
	
	/**
	 * Palauttaa kahdesta nimestä pidemmän
	 * @.pre nimi1, nimi2 != null
	 * @.post RESULT.length() > nimi.length()
	 */s
	
	public static String pidempiNimi(String nimi1, String nimi2) {
		if (nimi1.length() == nimi2.length()) {
			return null;
		}
		if (nimi1.length() > nimi2.length()) {
			return nimi1;
		} else {
			return nimi2;
		}
	}

}
