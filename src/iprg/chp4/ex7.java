package iprg.chp4;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        int nb, factoriel = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez un entier :");
        nb = sc.nextInt();
        if (nb >= 0){
            for (int i = nb; i > 0; i--){
                factoriel *= i;
            }
            System.out.println("Factoriel de " + nb + " est " + factoriel);
        }else{
            System.out.println("Le nombre ne peut pas etre negatif");
        }
    }
}
