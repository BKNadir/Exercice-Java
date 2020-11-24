package iprg.chp7;

import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        System.out.println("Introduiser un entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(estPair(sc.nextInt()));
    }
    public static String estPair(int a){
        if (a < 0) return "Le nombre est negatif";
        else if (a % 2 == 0) return "Le nombre est pair";
        else return "Le nombre est impair";
    }
}
