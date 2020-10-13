package iprg.chp3;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduisez des nombres. Terminer avec -1");
        int nb = sc.nextInt(), z = nb, y = nb;
        boolean c = true;
        while (nb != -1){ // rajouter la condition ET c pour arreter le programme plus tot  --> (nb != -1 && c)
            y = z;
            z = nb;
            if (y > z)
                c = false;
            nb = sc .nextInt();
        }
        if (c){
            System.out.println("La suite est croissante");
        } else {
            System.out.println("La suite n\'est pas croissante");
        }
    }
}
