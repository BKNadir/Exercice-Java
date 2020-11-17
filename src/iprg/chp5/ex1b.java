package iprg.chp5;

import java.util.Scanner;

public class ex1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 0)
            do {
                a -= b;
            } while (a >= 0);
        System.out.println(a + " " + b);
    }
/**
 * a = 5, b = 2     -1 2
 * a = 5, b = -2    -2147483647 -2
 * a = 5, b = 0     boucle infini
 * a = -5, b = 0    -5 0
 * **/
}
