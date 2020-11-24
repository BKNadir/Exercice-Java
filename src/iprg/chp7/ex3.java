package iprg.chp7;

import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entiers");
        Scanner sc = new Scanner(System.in);
        System.out.println(maximum(sc.nextInt(), sc.nextInt()));

    }
    public static int maximum(int a, int b){
        if (a > b) return a;
        return b;
    }
}
