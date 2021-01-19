package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex1 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(estVide(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(estVide(s2));
        SeqInt s3 = new SeqInt(9,1);
        System.out.println(estVide(s3));
    }
    public static boolean estVide(SeqInt seq){
        SeqIntIterator it = seq.iterator();
        return !it.hasNext();
    }
}
