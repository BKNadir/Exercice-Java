package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex8 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(pos(s1, 5));
        SeqInt s2 = new SeqInt();
        System.out.println(pos(s2, 5));
        SeqInt s3 = new SeqInt(1,2,3,32,0,0,5);
        System.out.println(pos(s3, 30));
    }
    public static int pos(SeqInt seq, int n){
        SeqIntIterator it = seq.iterator();
        if (!it.hasNext()) return -1;
        int pos = -1, s = 0;
        while (it.hasNext() && pos == -1){
            s++;
            if (it.next() == n) pos = s;
        }
        return pos;
    }
}
