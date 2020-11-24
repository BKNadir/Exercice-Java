package iprg.chp7;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(factoriel(sc.nextInt()));
    }
    public static int factoriel(int a){
        int factoriel = 1;
        for (int i = a; i > 0; i--){
            factoriel *= i;
        }
        return factoriel;
    }
}
