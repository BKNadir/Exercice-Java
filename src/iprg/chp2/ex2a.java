package iprg.chp2;
import java.util.Scanner;

public class ex2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 1){
            if (a > 0)
                System.out.println("Beaucoup");
            else
                System.out.println("Un");
        }
        else {
            System.out.println("Peu");
        }
        /*if (a > 0) {
            if (a > 1) {
                System.out.println("Beaucoup");
            } else {
                System.out.println("Un");
            }
        } else if (a > 1) {
            System.out.print("Zut");
        } else {
            System.out.println("Peu");
        }*/
    }
}
