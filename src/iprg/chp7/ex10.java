package iprg.chp7;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entiers");
        Scanner sc = new Scanner(System.in);
        if (estDivisible(sc.nextInt(), sc.nextInt())) System.out.println("est un multiple");
        else System.out.println("n\'est pas un multiple");
    }
    public static boolean estDivisible(int a, int b){
        return a % b == 0;
    }
}
