package interro;
import java.util.Scanner;
public class Question2B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Combien de nombres de la suite : ");
        int n = scan.nextInt();

        int num0 = 0, num1 = -1, num2 = 5, num3;
        System.out.println("0\n-1\n5");
        for (int i = 0; i < n-3; i++){
            num3 = 3 * num2 - 4 * num0;
            System.out.println(num3);
            num0 = num1;
            num1 = num2;
            num2 = num3;
        }
    }
}