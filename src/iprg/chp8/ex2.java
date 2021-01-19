package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex2 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(taille(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(taille(s2));
        SeqInt s3 = new SeqInt(9,1);
        System.out.println(taille(s3));
    }
    public static int taille(SeqInt seq){
        SeqIntIterator it = seq.iterator();
        int size = 0;
        while (it.hasNext()){
            size++;
            it.next();
        }
        return size;
    }
}
