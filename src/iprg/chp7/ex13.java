package iprg.chp7;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        carre(sc.nextInt());
    }
    public static void carre(int a){
        for (int i = 0; i < a; i ++){
            for (int j = 0; j < a; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
