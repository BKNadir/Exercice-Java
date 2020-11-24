package iprg.chp7;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(nombrePremier(sc.nextInt()));
    }
    public static int nombrePremier(int a){
        int nb = 0;
        for (int i = 2; i < a; i++)
            if (estPremier(a)) nb++;
        return nb;
    }
    public static boolean estPremier(int a){
        boolean estPremier = true;
        for (int i = 2; i < a/2 && estPremier; i++){
            if (a%i==0) estPremier = false;
        }
        return estPremier;
    }
}
