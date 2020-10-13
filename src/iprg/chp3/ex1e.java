package iprg.chp3;

import java.util.Scanner;

public class ex1e {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un entier (positif): ");
        int a = scan.nextInt(), k = 0;
        while (a > 1) {
            ++k;
            if (a % 2 == 0)
                a /= 2;
            else
                a = 3 * a + 1;
        }
        System.out.println("Bouclé " + k + " fois");

        // a = 12   affiche "Bouclé 9 fois"
        // a = 7    affiche "Bouclé 16 fois"
        // a = 128  affiche "Bouclé 7 fois"
    }
}
