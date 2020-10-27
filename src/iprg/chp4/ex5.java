package iprg.chp4;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez le nombre d'entier");
        int nb = sc.nextInt(), val, pos = 0, neg = 0, nulle=0;
        for (int i = 1; i <= nb; i++){
            val = sc.nextInt();
            if (val < 0){
                neg++;
            } else if(val == 0){
                nulle++;
            }else{
                pos++;
            }
        }
    }
}
