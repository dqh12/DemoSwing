package duanqihang_2012080093.T2;

public class Sample_2 {
    static void throwsEx() throws ArithmeticException{
        int[] a = new int[5];
        for(int i=0;i<=a.length;i++) {
            a[i] = 10/i;
        }
    }
    public static void main(String[] args) {
        try {
            Sample_2.throwsEx();
        }catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
