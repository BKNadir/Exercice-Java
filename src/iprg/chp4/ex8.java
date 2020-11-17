package iprg.chp4;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int nb, ex;
        double val;
        boolean neg = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un entier");
        nb = sc.nextInt();
        val = nb;
        System.out.println("Entrer l'exposant");
        ex = sc.nextByte();
        if(nb == 0 && ex == 0){
            System.out.println("Operation impossible");
        } else if (nb == 0){
            System.out.println("0");
        } else if (ex == 0){
            System.out.println("1");
        } else {
            if (ex < 0) {
                neg = true;
                ex *= -1;
            }
            for (int i = 1; i < ex; i++){
                val *= nb;
            }
            if (neg){
                val = 1 / val;
            }
            System.out.println(val);
        }
    }
}
