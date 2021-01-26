package iprg.chp8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class ex5 {
    public static void main(String[] args) {
        SeqInt s1 = new SeqInt(5);
        System.out.println(avg(s1));
        SeqInt s2 = new SeqInt();
        System.out.println(avg(s2));
        SeqInt s3 = new SeqInt(1,2,3,4,0,0,5);
        System.out.println(avg(s3));
    }
    public static double avg(SeqInt seq){
        SeqIntIterator it = seq.iterator();
        double sum = 0;
        int n = 0;
        if (! it.hasNext()) return -1;
        while (it.hasNext()){
            sum+=it.next();
            n++;
        }
        return sum/n;
    }
}
