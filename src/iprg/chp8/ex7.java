package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex7 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(max(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(max(s2));
        SeqInt s3 = new SeqInt(1,2,3,32,0,0,5);
        System.out.println(max(s3));
    }
    public static int max(SeqInt seq){
        SeqIntIterator it = seq.iterator();
        if (!it.hasNext()) return -1;
        int max = it.next(), n;
        while (it.hasNext()) {
            n = it.next();
            if (n > max) max = n;
        }
        return max;
    }
}
