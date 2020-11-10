package iprg.chp4;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        int nbentier, entier, pos = 0, moyenne = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombres d'entiers");
        nbentier= sc.nextInt();
        for (int i = 0; i < nbentier; i++){
            System.out.println("Introduisez un nombre");
            entier = sc.nextInt();
            if (entier >= 0){
                moyenne+=entier;
                pos++;
            }
        }
        System.out.println("Moyenne de " + (moyenne/(double)pos));
    }
}
