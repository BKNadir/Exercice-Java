package iprg.chp7;

public class ex1a {
    public static void fct_01a(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        int x = 1;
        for (int cpt = 1; cpt < 4; ++cpt) {
            fct_01a(cpt, x);
            x += 2;
        }
    }
    /**
     * Affiche
     * 2
     * 5
     * 8
     * **/
}
