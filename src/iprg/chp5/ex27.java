package iprg.chp5;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez des valeurs. Pour terminer introduisez -1");
        int nb = sc.nextInt(), last = nb;
        if (nb != -1) {
            do {
                last = nb;
                nb = sc.nextInt();
            } while (nb != -1);
            System.out.println("Derniere valeur " + last);
        }
    }
}