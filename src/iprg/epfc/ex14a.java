package iprg.epfc;

import java.util.Scanner;

public class ex14a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0)
            if (a > 1)
                if (a > 2)
                    System.out.println(3); // 3 ou plus grand que 3
                else
                    System.out.println(2); // 2
            else
                System.out.println(1); // 1
        else
            System.out.println("Erreur"); // moins de 1
    }
}
