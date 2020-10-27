package iprg.chp4;

public class ex1g {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 3; ++i) {
            if (a % 2 == 0) {
                a /= 2;
                System.out.println(i);
            }
            else
                a = 2 * a + i;
            System.out.println(a);
        }
    }
    /* affiche "
    3
    8
    3
    4

    " */
}
