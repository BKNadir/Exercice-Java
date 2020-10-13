package iprg.chp2;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        System.out.println("Introduisez 3 nombres.");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a < b && a < c) {
            System.out.println(b + " " + c);
        } else if (b < a && b < c) {
            System.out.println(a + " " + c);
        } else if (c < a && c < b){
            System.out.println(a + " " + b);
        }else{
            if ((a == b && a > c) || (a == c && a > b)){
                System.out.println(a + " est le plus grand");
            } else if ((b == a && b > c) || (b == c && b > a)){
                System.out.println(b + " est le plus grand");
            } else if ((c == b && c > a) || (c == a && c > b)) {
                System.out.println(b + " est le plus grand");
            }else {
                System.out.println("Meme valeurs");
            }
        }
    }
}
