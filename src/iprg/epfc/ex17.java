package iprg.epfc;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez deux entiers");
        double a = sc.nextDouble(), b = sc.nextDouble();
        if ((a >= 0 && b >= 0) || a == 0 || b == 0){
            System.out.println("Resulta positif ou nul");
        } else {
            System.out.println("Resulta negatif");
        }
    }
}
