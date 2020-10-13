package iprg.chp3;

import java.util.Scanner;

public class ex1f {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un entier (positif): ");
        int a = scan.nextInt(), k = 0;
        while (a % 2 == 1) {
            ++k;
            a = (3 * a + 1) / 2;
        }
        System.out.println("Bouclé " + k + " fois");

        // a = 12   affiche "Bouclé 0 fois"
        // a = 7    affiche "Bouclé 3 fois"
        // a = 127  affiche "Bouclé 7 fois"
    }
}
