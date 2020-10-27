package iprg.chp4;

import java.util.Scanner;

public class ex1h {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int p = 0, s = 1;
        if (b < 0) {
            s = -1;
            b = -b;
        }
        for (int i = 0; i < b; ++i) {
            p += a;
        }
        // Que représente la valeur affichée ?
        System.out.println(s * p);
        // le produit de a et de b
    }
}
