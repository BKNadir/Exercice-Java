package iprg.chp7;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(multiplication(sc.nextInt(), sc.nextInt()));
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
}
