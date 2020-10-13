package iprg.chp2;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduiser le kilometrage");
        double km = sc.nextDouble();
        System.out.println("Introduisez le nombre de jour");
        double nbj = sc.nextDouble();
        double val = 0;
        if (km > 50){
            if (km > 500) {
                val += (km-500) * 1.25 * 1.10 + 450 * 1.25;
            } else {
                val += (km-50) * 1.25;
            }
        }
        System.out.println("Montant total de " + (nbj * 250 + val) + "€");
    }
}
