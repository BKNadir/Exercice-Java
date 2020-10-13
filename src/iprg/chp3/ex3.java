package iprg.chp3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moyenne de combien de nombre ?");
        int nb = sc.nextInt();
        while(nb < 1 ){
            System.out.println("Introduisez un nombre strictement positif");
            nb = sc.nextInt();
        }
        double cpt = nb, moyenne = 0;
        while (cpt != 0){
            moyenne += sc.nextDouble();
            cpt--;
        }
        System.out.println("Moyenne de " + (moyenne/nb));
    }
}
