package iprg.interro;

public class Question3B {
    public static boolean estPremier(int n) { //la fonction doit etre de type boolean et pas void car on return un boolean
        int candidatDiviseur = 2;
        while (candidatDiviseur < n && n % candidatDiviseur != 0) {
            ++candidatDiviseur;
        }
        return candidatDiviseur == n;
    }
    public static int primorielle(int n) {
        int produit = 1;
        for(int i = 1; i <= n; ++i) {
            if(estPremier(i)) {
                produit *= i;
            }
        }
        return produit; // Il manque un return
    }
    public static void main(String[] args) {
        System.out.println(primorielle(10));
        System.out.println(primorielle((int)(21.3))); // la fonction primorielle prend un parametre de type int donc le cast est necessaire pour convertir le double en int
    }
}
