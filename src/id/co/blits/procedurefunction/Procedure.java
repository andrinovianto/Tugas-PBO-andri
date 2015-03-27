package id.co.blits.procedurefunction;

/**
 *
 * @author andri
 */
public class Procedure {
    public static void main(String[] args) {
    int hasil,nilai;
    int n;

    n = nilai(2,5,10);
    hasil = n * 10;
    System.out.println("Hasilnya adalah = "+hasil);
    }
    
    public static int nilai (int nilai1, int nilai2,int nilai3){//fungsi
    int n;

    nilai1 = nilai1 * 2;
    n = nilai1 * nilai2 * nilai3;
    return n;

    }
}

