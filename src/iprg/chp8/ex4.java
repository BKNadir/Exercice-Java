package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex4 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(getCount(s1, 5));
        SeqInt s2 = new SeqInt();
        System.out.println(getCount(s2, 5));
        SeqInt s3 = new SeqInt(5,3,5,5,3,0,5,3);
        System.out.println(getCount(s3, 5));
    }
    public static int getCount(SeqInt seq, int n){
        SeqIntIterator it = seq.iterator();
        int count = 0;
        while (it.hasNext()){
            if (it.next()==n) count++;
        }
        return count;
    }
}
