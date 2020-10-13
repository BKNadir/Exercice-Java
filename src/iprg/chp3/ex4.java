package iprg.chp3;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez une valeur max");
        int max = sc.nextInt(), cumul = 0, cpt = 1;
        while (cumul + cpt < max){
            cumul += cpt;
            cpt ++;
        }
        System.out.println("Le cumule max est de " + (cpt-1));
    }
}
