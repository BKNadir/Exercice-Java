package iprg.chp7;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entiers");
        Scanner sc = new Scanner(System.in);
        System.out.println(estDivisible(sc.nextInt(), sc.nextInt()));
    }
    public static String estDivisible(int a, int b){
        if (a % b == 0) return b + " est un multiple de " + a;
        return b + " n\'est pas un multiple de " + a;
    }
}
