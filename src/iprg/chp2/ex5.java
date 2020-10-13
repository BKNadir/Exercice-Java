package iprg.chp2;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez deux nombres");
        Double n1 = sc.nextDouble(), n2 = sc.nextDouble();
        if ( n1 > n2)
            System.out.println("Le premier est plus grand que le deuxieme");
        else if (n2 > n1)
            System.out.println("Le deuxieme est plus grand que le premier");
        else
            System.out.println("Les deux nombres sont egaux");
    }
}
