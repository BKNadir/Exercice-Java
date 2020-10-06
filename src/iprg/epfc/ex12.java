package iprg.epfc;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez 3 valeurs");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a == b || a == c){
            System.out.println(a);
        }
        if (b == c){
            System.out.println(b);
        }
    }
}
