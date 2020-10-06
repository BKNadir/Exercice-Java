package iprg.epfc;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez un nombre");
        Double nb = sc.nextDouble();
        if (0 < nb && nb < 11)
            System.out.println(nb + " est compris entre 1 et 10");
        else
            System.out.println(nb + " n\'est pas compris entre 1 et 10");
    }
}
