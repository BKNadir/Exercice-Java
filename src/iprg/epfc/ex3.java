package iprg.epfc;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez un nombre");
        double n = sc.nextDouble();
        if ( n >= 0)
            System.out.println("|" + n + "| = " + n);
        else
            System.out.println("|" + n + "| = " + -n);
    }
}
