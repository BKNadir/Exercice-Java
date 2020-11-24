package iprg.chp7;

import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        if (estPair(sc.nextInt())) System.out.println("Le nombre est pair");
        else System.out.println("Le nombre est nul ou impair");
    }
    public static boolean estPair(int a){
        if (a == 0) return false;
        return a%2 == 0;
    }
}
