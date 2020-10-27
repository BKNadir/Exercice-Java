package iprg.chp4;

public class ex1c {
    public static void main(String[] args) {
        int a = 3, b = 0;
        for (int k = 1; k < 5; ++k)
            b = 2 * a + b;
        System.out.println(a + " " + b);
    }
    // affiche "3 24"
}
