package iprg.chp2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez deux nombres");
        Double n1 = sc.nextDouble(), n2 = sc.nextDouble();
        if (n1 > n2)
            System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        else
            System.out.println(n2 + " - " + n1 + " = " + (n2-n1));
    }
}
