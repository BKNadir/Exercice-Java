package iprg.chp3;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez des valeurs. Pour terminer introduisez -1");
        int nb = sc.nextInt(), last = nb;
        while (nb != -1){
            last = nb;
            nb = sc.nextInt();
        }
        System.out.println("Derniere valeur " + last);
    }
}
