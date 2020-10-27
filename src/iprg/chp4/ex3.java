package iprg.chp4;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduiser un entier");
        int n = sc.nextInt(), somme = 0;
        for (int i = 1 ; i <= n; i++){
            System.out.println("Entier " + i);
            somme += sc.nextInt();
        }
        System.out.println("Moyenne de " + ((double)somme/n));
    }
}
