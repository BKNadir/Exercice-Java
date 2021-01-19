package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex3 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(somme(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(somme(s2));
        SeqInt s3 = new SeqInt(9,1);
        System.out.println(somme(s3));
    }
    public static int somme(SeqInt seq){
        SeqIntIterator it = seq.iterator();
        int somme = 0;
        while (it.hasNext()) somme+=it.next();
        return somme;
    }
}
