package interro;
import java.util.Scanner;
public class Question1B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez la hauteur de la figure : ");
        int hauteur = scan.nextInt();
        /**
        for (int i = 0; i < hauteur; i++){
            for (int j = 0; j < hauteur; j++){
                if (((i >= j) && hauteur / 2 >i) || (hauteur / 2 == i) || ((i < j) && hauteur / 2 < i)){
                    System.out.print("x");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }**/

        for (int ligne = 0; ligne < hauteur; ligne ++){
            for (int colonne = 0; colonne < hauteur; colonne++){
                if (ligne < (hauteur/2)){
                    if (ligne >= colonne){
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (ligne == (hauteur/2)){
                    System.out.print("x");
                }
                if (ligne > (hauteur/2)){
                    if (ligne > colonne){
                        System.out.print(" ");
                    } else {
                        System.out.print("x");
                    }
                }
            }
            System.out.println();
        }

    }
}