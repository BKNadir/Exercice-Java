package iprg.epfc;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduisez une heure ");
        int h = sc.nextInt();
        System.out.print("Introduisez les minutes ");
        int m = sc.nextInt();
        m += h*60 + 1;
        System.out.println("L\'instant d\'apres il sera " + m/60 + "h" + m%60);
    }
}
