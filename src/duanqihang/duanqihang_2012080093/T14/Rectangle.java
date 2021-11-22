package duanqihang.duanqihang_2012080093.T14;

public class Rectangle {
    private int length;
    private int width;
    public Rectangle(){}
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public boolean isSquare(){
        return width==length?true:false;
    }
    public int area(){
        return width*length;
    }

}
