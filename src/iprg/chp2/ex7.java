package iprg.chp2;

public class ex7 {
    public static void main(String[] args){
        int a, b, c;
        boolean test1, test2, test3, arret;
        a = 2;  // a = 2
        b = 3;  // b = 3
        c = 4;  // c = 4
        test1 = true;   // test1 = true
        test2 = (b >= a) && (c >= b);   // test2 = true
        test3 = test1 || test2; // test3 = true
        arret = test3 && (!test2);  // arret = false
        a += 1; // a = 3
        b -= 1; // b = 2
        c -= 2; // c = 2
        test1 = true;   // test1 = true
        test2 = (b >= a) && (c >= b);   // test2 = false
        test3 = test1 || test2; // test3 = true
        arret = arret || test2; // arret = false
    }
}
