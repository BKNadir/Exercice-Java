package iprg.epfc;
import java.util.Scanner;

public class ex1b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 2) {
            System.out.print("vive");
            if (b < 5) {
                System.out.print(" la");
            } else {
                System.out.print("ment");
            }
            System.out.println(" mariée");
        }
    }
}
