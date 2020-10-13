package iprg.chp2;
import java.util.Scanner;

public class ex2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b > 1){
            if (a > 0)
                System.out.println("Bonjour");
            else
                System.out.println("Coucou");
        } else {
            System.out.println("Salut");
        }
        /*if (a > 0)
            if (b > 1)
                System.out.println("Bonjour");
            else
                System.out.println("Salut");
        else
        if (b > 1)
            System.out.println("Coucou");
        else
            System.out.println("Salut");*/
    }
}
