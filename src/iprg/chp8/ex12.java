package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex12 {
    public static void main(String[] args) {

        SeqInt s1 = new SeqInt(5, 9);
        System.out.println(maximum(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(maximum(s2));
        SeqInt s3 = new SeqInt(1, 2, 23, 3, 23, 5);
        System.out.println(maximum(s3));
    }

    public static int maximum(SeqInt s){
        SeqIntIterator it = s.iterator();
        int pos = -1;
        if (it.hasNext()){
            int max = it.next();
            int currentPos = 1;
            while (it.hasNext()){
                int x = it.next();
                currentPos++;
                if (x > max) {
                    max = x;
                    pos = currentPos;
                }
            }
        }
        return pos;
    }
}
