package iprg.epfc;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        System.out.println("Entrez 3 nombres");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a <= b && a <= c){
            System.out.println(a);
            if (b<=c){
                System.out.println(b+"\n"+c);
            }else{
                System.out.println(c+"\n"+b);
            }
        }else if (b <= c){
            System.out.println(b);
            if (a<=c){
                System.out.println(a+"\n"+c);
            }else{
                System.out.println(c+"\n"+a);
            }
        }else{
            System.out.println(c);
            if (a<=b){
                System.out.println(a+"\n"+b);
            }else{
                System.out.println(b+"\n"+a);
            }
        }
    }
}
