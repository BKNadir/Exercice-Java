package iprg.chp7;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        if (estPremier(sc.nextInt())) System.out.println("est un nombre premier");
        else System.out.println("n\'est pas un nombre premier");
    }
    public static boolean estPremier(int a){
        boolean estPremier = true;
        for (int i = 2; i < a/2 && estPremier; i++){
            if (a%i==0) estPremier = false;
        }
        return estPremier;
    }
}
