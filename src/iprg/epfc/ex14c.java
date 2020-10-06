package iprg.epfc;

import java.util.Scanner;

public class ex14c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a != 0) {
            if(a > 0)
                System.out.println("C'est bien"); // 1 ou plus de 1
        }
        else
            System.out.println("C'est \"nul\""); // 0
    }
}
