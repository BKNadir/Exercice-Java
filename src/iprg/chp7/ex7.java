package iprg.chp7;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        System.out.println("Introduiser deux entier");
        Scanner sc = new Scanner(System.in);
        System.out.println(exposant(sc.nextInt(), sc.nextInt()));
    }
    public static int exposant(int a, int b){
        if (b < 0) return 0;
        int exposant = 1;
        for (int i = 0; i < b; i++){
            exposant *= a;
        }
        return exposant;
    }
}
