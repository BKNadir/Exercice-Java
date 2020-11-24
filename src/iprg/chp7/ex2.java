package iprg.chp7;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entiers");
        Scanner sc = new Scanner(System.in);
        System.out.println(moyenne(sc.nextDouble(), sc.nextDouble()));

    }
    public static double moyenne(double a, double b){
        return (a+b)/2;
    }
}
