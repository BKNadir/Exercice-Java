package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex10 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5, 9);
        System.out.println(doublon(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(doublon(s2));
        SeqInt s3 = new SeqInt(1, 2, 3, 3, 0, 5);
        System.out.println(doublon(s3));
    }

    public static boolean doublon(SeqInt i){
        SeqIntIterator it = i.iterator();
        boolean doublon = false;
        int last, current;
        if (it.hasNext()){
            last = it.next();
            while (it.hasNext() && doublon != true){
                current = it.next();
                doublon = last == current;
                last = current;
            }
        }
        return doublon;
    }
}


