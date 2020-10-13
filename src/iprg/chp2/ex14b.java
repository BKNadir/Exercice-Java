package iprg.chp2;

import java.util.Scanner;

public class ex14b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a > 2)
            System.out.println(3); // 3 ou plus grand que 3
        else if(a > 1)
            System.out.println(2); // 2
        else if(a > 0)
            System.out.println(1); // 1
        else
            System.out.println("Erreur"); // moins de 1
    }

}
