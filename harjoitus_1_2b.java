package harjoitus_1_2;

public class harjoitus_1_2b {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {3, 2, 1};
		int[] c = {1, 3, 2};
		System.out.println(luokitteleSyotetaulukko(a));
		System.out.println(luokitteleSyotetaulukko(b));
		System.out.println(luokitteleSyotetaulukko(c));		
	}
	
	public static int luokitteleSyotetaulukko(int[] t) {		
		if (aidostiLaskeva(t)) {
			return -1;
		}
		if (aidostiNouseva(t)) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static boolean aidostiLaskeva(int[] t) {
		for (int i = 0; i < t.length-1; i++) {
			if (t[i+1] >= t[i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean aidostiNouseva(int[] t) {
		for (int i = 0; i < t.length-1; i++) {
			if (t[i+1] <= t[i]) {
				return false;
			}
		}
		return true;
	}	
}
