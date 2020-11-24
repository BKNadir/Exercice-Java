package iprg.chp6;

import java.util.Scanner;

public class ex1c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h; i++){
            for (int j = 0; j < h; j++){
                if (i == j || i + j == h-1)
                    System.out.print("x");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}