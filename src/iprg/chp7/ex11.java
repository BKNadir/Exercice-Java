package iprg.chp7;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(estPremier(sc.nextInt()));
    }
    public static String estPremier(int a){
        boolean estPremier = true;
        for (int i = 2; i < a/2 && estPremier; i++){
            if (a%i==0) estPremier = false;
        }
        if (estPremier) return a + " est un nombre premier";
        return a + " n\'est pas un nombre premier";
    }
}
