package duanqihang_2012080093.T3;

class MyException extends Exception{
    public MyException() {
        super();
    }
    public MyException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
public class Sample_3 {
    public static void myE() throws MyException{
        try {
            int a = 10/0;

        }catch(ArithmeticException e) {
            throw new MyException(e.getMessage(),e.getCause());
        }
    }
    public static void main(String[] args) {
        try {
            Sample_3.myE();
        }catch(MyException e) {
            System.out.println(e);
        }
    }

}