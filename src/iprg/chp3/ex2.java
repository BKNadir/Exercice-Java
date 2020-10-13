package iprg.chp3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moyenne de combien de nombre ?");
        double nb = sc.nextInt(),cpt = nb, moyenne = 0;
        while (cpt != 0){
            moyenne += sc.nextDouble();
            cpt--;
        }
        System.out.println("Moyenne de " + (moyenne/nb));
    }
}
