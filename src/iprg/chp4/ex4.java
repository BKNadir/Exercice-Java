package iprg.chp4;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez le nombre d'entier");
        int nb = sc.nextInt(), min, n;
        System.out.println("Entier 1");
        min = sc.nextInt();
        for (int i = 2; i <= nb; i++){
            System.out.println("Entier " + i);
            n = sc.nextInt();
            if (min > n)
                min = n;
        }
        System.out.println("Le minimum est " + min);
    }
}
