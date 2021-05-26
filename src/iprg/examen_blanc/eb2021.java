package iprg.examen_blanc;

import java.util.Scanner;

public class eb2021 {
    public static void main(String[] args) {
        System.out.println(saisieTemperature());
        afficherVariationTemperatures(12, 8, 15);
    }

    public static int saisieTemperature(){
        int temp;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduisez une température comprise entre -40° et 50°.");
            temp = sc.nextInt();
            if (temp < -40 || temp > 50) System.out.println("Les bornes ne sont pas respectées.");
        }while (temp >= -40 && temp <= 50);

        return temp;
    }

    public static void afficherVariationTemperatures(int t1, int t2, int t3){
        int augmentationT = 0;
        if (t1 < t2){
            augmentationT++;
            if (t2 < t3){
                augmentationT++;
            }
        } else {
            if (t1 < t3){
                augmentationT++;
            }
        }
        System.out.println("Les écarts sont " + (t2 - t1) + " et " + (t3 - t2) + ".");
        System.out.println("Il y a eu " + augmentationT + " augmentation(s) de températures.");
    }
}
