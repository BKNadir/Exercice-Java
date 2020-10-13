package iprg.epfc;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez deux nombres");
        double a = sc.nextDouble(), b = sc.nextDouble();
        if ((a > b  && a < -b) || ( b > a && b < -a)){
            System.out.println("Negatif");
        } else {
            System.out.println("Positif ou nul");
        }
    }
}
