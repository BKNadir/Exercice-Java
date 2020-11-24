package iprg.chp7;

import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        if (estNegatif(sc.nextInt())) System.out.println("Nombre positif");
        else System.out.println("Nombre negatif");
    }
    public static boolean estNegatif(int a){
        return (a > 0);
    }
}
