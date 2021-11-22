package practic.Example1;

import javax.swing.*;
import java.awt.*;

public class Example_6_5_JComboBox extends JFrame {
    private static final long serialVersionUID = 1L;

    public Example_6_5_JComboBox(){
        super("显示组合框JComboBox");
        Container contentPage = this.getContentPane();
        JPanel jPanel1 = new JPanel(new GridLayout(1,2));
        String[] fruit = {"苹果","香蕉","桔子","梨","芒果"};
        JComboBox<String> jComboBox1 = new JComboBox<String>(fruit);
        jComboBox1.addItem("其他");
        jComboBox1.setBorder(BorderFactory.createTitledBorder("您最喜欢的水果"));
        jPanel1.add(jComboBox1);

        ComboBoxModel<String> mymodel = new MyComboBoxModel();
        JComboBox<String> jComboBox2 = new JComboBox<String>(mymodel);
        jComboBox2.setBorder(BorderFactory.createTitledBorder("您最喜欢的水果"));
        jPanel1.add(jComboBox2);
        contentPage.add(jPanel1);
        this.setBounds(300,200,350,90);
        this.setSize(350,90);
        this.setLocation(300,200);
        this.setVisible(true);
    }
    public static void main(String[] args){
        new Example_6_5_JComboBox();
    }
    class MyComboBoxModel extends DefaultComboBoxModel<String>{
        private static final long serialVersionUID = 1L;
        String[] fruit = {"苹果","香蕉","桔子","梨","芒果"};
        MyComboBoxModel(){
            for(int i=0;i<fruit.length;i++){
                this.addElement(fruit[i]);
            }
        }
    }
}
