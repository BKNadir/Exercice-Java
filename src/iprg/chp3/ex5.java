package iprg.chp3;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez des noombre afin d'etablir une moyenne. Terminer la suite par -1 pour effectuer la moyenne.");
        int cpt = 0;
        double val = sc.nextDouble(), moyenne = 0;
        while (val != -1){
            moyenne += val;
            val = sc.nextDouble();
            cpt++;
        }
        System.out.println("Moyenne de " + (moyenne/cpt));
    }
}
