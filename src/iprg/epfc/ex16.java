package iprg.epfc;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une annee");
        int a = sc.nextInt();
        if ((a % 4 == 0) && (a % 100 != 0 || a % 400 == 0))
            System.out.println(a + " est une annee bissextile");
    }
}
