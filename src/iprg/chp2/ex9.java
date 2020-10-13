package iprg.chp2;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args){
        System.out.println("Introduisez trois nombres");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble(), max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;
        if (n3 > max)
            max = n3;
        System.out.println("Le maximum est " + max);
    }
}
