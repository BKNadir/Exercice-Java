package iprg.chp5;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moyenne de combien de nombre ?");
        int nb;
        do {
            System.out.println("Introduisez un nombre strictement positif");
            nb = sc.nextInt();
        } while(nb < 1 );
        double cpt = nb, moyenne = 0;
        do {
            moyenne += sc.nextDouble();
            cpt--;
        } while (cpt != 0);
        System.out.println("Moyenne de " + (moyenne/nb));
    }
}
