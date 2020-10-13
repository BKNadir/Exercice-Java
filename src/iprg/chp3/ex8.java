package iprg.chp3;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez des valeurs. Pour terminer introduisez -1");
        int nb = sc.nextInt(),first = nb, last = nb;
        while (nb != -1){
            last = nb;
            nb = sc.nextInt();
        }
        if (first == -1){
            System.out.println("La suite est vide");
        } else if (first > last){
            System.out.println("Le premier est supperieur au dernier");
        } else if (first < last){
            System.out.println("Le premier est inferrieur au dernier");
        } else if (first == last){ // condition non obligatoire
            System.out.println("Le premier est egale au dernier");
        }
    }
}
