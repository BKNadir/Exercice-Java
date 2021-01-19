package iprg.interro;

public class Question4B {
    public static void main(String[] args) {
        affiche(123450);
        affiche(-123450);
        affiche(0);
    }
    public static void affiche(int n){
        if (n == 0){
            System.out.println(0);
        }else{
            if (n < 0){
                System.out.print("-");
                n*=-1;
            }
            for (;n > 0; n=n/10){
                System.out.print(n%10);
            }
            System.out.println();
        }
    }
}
