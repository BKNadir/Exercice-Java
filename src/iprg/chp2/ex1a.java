package iprg.chp2;
import java.util.Scanner;

public class ex1a {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) b = 2;
        System.out.println(a + b);
    }
}
