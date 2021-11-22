package duanqihang_2012080093.T1;

public class Sample_1 {
    public static void main(String[] args) {
        Sample_1.error();
    }
    public static void error() {
        int[] a = new int[5];
        for(int i=0;i<=a.length;i++) {
            try {
                a[i] = 10/i;
            }catch(ArithmeticException e){
                e.printStackTrace();
            }catch(ArrayIndexOutOfBoundsException e) {
                System.out.print("下标越界处为 i = "+e.getMessage());
            }finally {
                System.out.println("循环次数为:i = "+i);
            }
        }
    }
}
