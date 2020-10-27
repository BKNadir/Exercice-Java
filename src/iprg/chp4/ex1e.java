package iprg.chp4;

public class ex1e {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 1; i <= 3; ++i)
            a += i;
        for (int i = 4; i <= 5; ++i)
            a += 1;
        System.out.println(a);
    }
    // affiche "9"
}
