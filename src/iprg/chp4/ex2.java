package iprg.chp4;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez un entier");
        int n = sc.nextInt();
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(i + " x " + n + " = " + (i*n));
        }
    }
}
