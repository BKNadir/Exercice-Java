package iprg.chp4;

public class ex1d {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 4; ++i) {
            if (a % 2 == 0)
                ++a;
            a += i;
        }
        System.out.println(a);
    }
    // affiche "13"
}
