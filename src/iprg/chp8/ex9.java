package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex9 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 9);
        System.out.println(pos(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(pos(s2));
        SeqInt s3 = new SeqInt(1,2,3,4,0,5);
        System.out.println(pos(s3));
    }
    public static boolean pos(SeqInt seq){
        SeqIntIterator it = seq.iterator();
        if (it.hasNext()){
            int old = it.next(), n;
            while (it.hasNext()){
                n = it.next();
                if (n < old) return false;
                old = n;
            }
        }
        return true;
    }
}
