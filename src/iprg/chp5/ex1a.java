package iprg.chp5;

import java.util.Scanner;

public class ex1a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer 2 nbs. entiers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        do {
            a *= 2;
            b += a;
        } while (b <= 20);
        System.out.println(a + " " + b);
    }
/**
 * a = 5, b = 2     20 32
 * a = 5, b = -2    20 28
 * a = 5, b = 0     20 30
 * a = -5, b = 0    -1342177280 1610612746
 * **/
}
