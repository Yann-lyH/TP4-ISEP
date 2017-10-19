

public class TriRecursif {

	
	    public static void main(String[] args) {
	    }

	    public static void triFusion(int tableau[]) {
	        int longueur = tableau.length;
	        if (longueur > 0) {
	            triFusion(tableau, 0, longueur - 1);
	        }
	    }

	    public static int [] triFusion(int tableau[], int debut, int fin) {
	        if (debut != fin) {
	            int milieu = (fin + debut) / 2;
	            triFusion(tableau, debut, milieu);
	            triFusion(tableau, milieu + 1, fin);
	            fusion(tableau, debut, milieu, fin);
	        }
	        return (tableau);
	    }

	    public static void fusion(int tableau[], int debut1, int fin1, int fin2) {
	        int debut2 = fin1 + 1;

	        int table1[] = new int[fin1 - debut1 + 1];
	        for (int i = debut1; i <= fin1; i++) {
	            table1[i - debut1] = tableau[i];
	        }

	        int a = debut1;
	        int b = debut2;

	        for (int i = debut1; i <= fin2; i++) {
	            if (a == debut2) {
	                break;
	            } else if (b == (fin2 + 1)) {
	                tableau[i] = table1[a - debut1];
	                a++;
	            } else if (table1[a - debut1] < tableau[b]) {
	                tableau[i] = table1[a - debut1];
	                a++;
	            } else {
	                tableau[i] = tableau[b];
	                b++;
	            }
	        }
	    }
	}