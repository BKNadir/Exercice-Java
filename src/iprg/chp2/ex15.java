package iprg.chp2;

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez un nombre");
        double nb = sc.nextDouble();
        if (nb > 0){
            if (nb == 1){
                System.out.println("nb vaut 1");
            }
        } else {
            System.out.println("nb est inferieure ou egal a 0");
        }
    }

}
