package iprg.chp7;

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        estNegatif(sc.nextInt());
    }
    public static void estNegatif(int a){
        if (a > 0) System.out.println("Nombre positif");
        else System.out.println("Nombre negatif");
    }
}
