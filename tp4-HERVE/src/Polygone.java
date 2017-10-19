
import java.util.Scanner;

public class Polygone {
	public static double maxDistance(float[][] sommets) {
		double x;
		int a = 0;
		int b = 0;
		double diagonaleMax = 0;
		for (int i = 0; i < sommets.length; i++) {
			for (int j = 0; j < sommets.length; j++) {
				if (i != j) {
					x = Math.sqrt(Math.pow((sommets[j][0] - sommets[i][0]), 2)
							+ Math.pow((sommets[j][1] - sommets[i][1]), 2));
					if (diagonaleMax < x) {
						diagonaleMax = x;
						a = i;
						b = j;

					}
				} else {
					break;

				}
			}

		}
		System.out.println("la diagonale la plus grande mesure envirron: " + diagonaleMax
				+ " cm et est la distance entre le point dont les coordonnée sont à la ligne " + (a + 1)
				+ " et celui à la ligne " + (b + 1));
		return (diagonaleMax);

	}

	public static void main(String[] args) {
		//Sinon on rentre nous même les coordonnées des sommets du polygone.
		// System.out.println("pour un carré de côté 1: ");
		// float[][] sommets = {{0,0}, {0,1}, {1,1}, {1,0}}; 
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer le nombre de sommets: ");
		int n = scan.nextInt();
		float[][] sommets = new float[n][2];
		for (int i = 0; i < sommets.length; i++) {
			for (int j = 0; j < 2; j++) {
				float coord = (float) (Math.random() * 10);
				sommets[i][j] = Math.round(coord);
			}
		}

		System.out.println("tableau de coordonnées: ");
		for (int i = 0; i < sommets.length; i++) {
			for (int j = 0; j < sommets[0].length; j++) {
				System.out.print("" + sommets[i][j] + " ");
			}
			System.out.println("");
		}
		scan.close();
		maxDistance(sommets);

	}

}
