package iprg.chp7;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(exposant(sc.nextInt(), sc.nextInt()));
    }
    public static int multiplication(int a, int b){
        if (a == 0  || b == 0) return 0;
        else {
            int negatif = 1;
            if (a < 0){
                negatif *= -1;
                a *= -1;
            }
            if (b < 0){
                negatif *= -1;
                b *= -1;
            }
            int somme = 0;
            for (int i = 0; i < a; i ++){
                somme += b;
            }
            return somme*negatif;
        }
    }
    public static int exposant(int a, int b){
        if (b < 0) return 0;
        int exposant = 1;
        for (int i = 0; i < b; i++){
            exposant = multiplication(exposant, a);
        }
        return exposant;
    }
}
