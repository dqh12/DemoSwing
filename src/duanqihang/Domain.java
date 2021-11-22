package duanqihang;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Domain {
    public static void main(String[] args){
        new WindowRtl();
    }
    public static boolean judge(String item) {
        String []strs = {"(",")","+","-","*","/","%"};

        boolean []ss = new boolean[strs.length];
        for(int i=0;i< strs.length;i++) {
            ss[i] = item.equals(strs[i]);
        }
        if(!ss[0]&&!ss[1]&&!ss[2]&&!ss[3]&&!ss[4]&&!ss[5]&&!ss[6]) {
            return true;
        }else {
            return false;
        }
    }
    public static List<String> parseSuffixExpressionList(List<String> li){
        Stack<String> st1 = new Stack();
        List<String> st2 = new ArrayList<String>();//s2没有pop操作，之后输出时应该逆序输出

        for(String item : li) {
            if(judge(item)) {
                st2.add(item);
            }else if(item.equals("(")) {
                st1.push(item);
            }else if(item.equals(")")) {
                while(!st1.peek().equals("(")) {
                    st2.add(st1.pop());
                }
                st1.pop();
            }else {
                while(st1.size()!=0&&Operation.getValue(st1.peek())>=Operation.getValue(item)) {
                    st2.add(st1.pop());
                }
                st1.push(item);
            }
        }
        while(st1.size()!=0) {
            st2.add(st1.pop());
        }
        return st2;
    }
    public static List<String> getListString(String str){
        String[] split = str.split(" ");
        List<String> list = new ArrayList<String>();
        for(String ele : split) {
            list.add(ele);
        }
        return list;
    }
    public static List<String> toInfixExpressionList(String s){
        List<String> li = new ArrayList<String>();
        int i = 0;
        String s1;
        char c;
        do {
            if((c=s.charAt(i)) < 48|| (c=s.charAt(i)) > 57) {
                li.add(""+c);
                i++;
            }else {
                s1 = "";
                while( ((c=s.charAt(i))>=48&&(c=s.charAt(i))<=57)||((c=s.charAt(i))==46)) {
                    s1 += c;
                    i++;
                    if(i >= s.length()) {
                        break;
                    }
                }
                li.add(s1);
            }

        }while(i<s.length());
        return li;

    }
    public static double calculate(List<String> list) {
        Stack<String> stack = new Stack();

        for(String ele : list) {
            if(judge(ele)) {
                stack.push(ele);
            }else {
                double res = 0;
                double num2 = Double.parseDouble(stack.pop());
                double num1 = Double.parseDouble(stack.pop());
                if(ele.equals("+")) {
                    res = num1+num2;
                }else if(ele.equals("-")) {
                    res = num1-num2;
                }else if(ele.equals("*")) {
                    res = num1*num2;
                }else if(ele.equals("/")) {
                    res = num1/num2;
                }else if(ele.equals("%")){
                    int num11 = (int)num1;
                    int num22= (int)num2;
                    res = num11%num22;
                }else{
                    throw new RuntimeException("运算符有误");
                }
                stack.push(""+res);
            }
        }
        return Double.parseDouble(stack.pop());
    }
}
class Operation{
    private static int ADD = 1;//加
    private static int SUB = 1;//减
    private static int MUL = 2;//乘
    private static int DIV = 2;//除
    private static int QUM = 2;//取模
    public static int getValue(String operation) {
        int result = 0;
        if(!operation.equals("(")&&!operation.equals(")")) {
            switch (operation) {
                case "+":
                    result = ADD;
                    break;
                case "-":
                    result = SUB;
                    break;
                case "*":
                    result = MUL;
                    break;
                case "/":
                    result = DIV;
                    break;
                case "%":
                    result = QUM;
                    break;
                default:
                    System.out.println("不存在该运算符");
                    break;
            }
        }
        return result;
    }
}
