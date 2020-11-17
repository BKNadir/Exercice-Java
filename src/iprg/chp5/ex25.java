package iprg.chp5;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez des nombres afin d'etablir une moyenne. Terminer la suite par -1 pour effectuer la moyenne.");
        int cpt = 0;
        double val, moyenne = 1;
        do {
            val = sc.nextDouble();
            moyenne += val;
            cpt++;
        } while (val != -1);
        if (cpt != 0)
            System.out.println("Moyenne de " + (moyenne/(cpt-1)));
    }
}
