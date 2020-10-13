package iprg.chp2;

import java.util.Scanner;

public class ex8b {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if (x < y && y < z) // La condition n'est pas valide
            System.out.println("En ordre croissants");
    }
}
