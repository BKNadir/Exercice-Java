package iprg.chp3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduiser une valeur max");
        int val = sc.nextInt(), cpt = 1;
        while ( cpt * cpt < val){
            System.out.print(cpt + " ");
            cpt++;
        }
    }
}
