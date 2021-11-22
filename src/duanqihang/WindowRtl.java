package duanqihang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class WindowRtl extends JFrame implements ActionListener {
    private String[] str = {"(",")","←","C",".","%","7","8","9","4","5","6","1","2","3","+","0","-","/","=","*"};
    private JPanel jPanel = new JPanel();
    private JButton[] strs = new JButton[str.length];
    private JTextArea text = new JTextArea();
    private String szong = "";
    private String []szong1 = new String[1000];
    private String szhen = "";
    int a = 0;
    public WindowRtl(){
        super("计算器");
        this.setBounds(100,100,400,423);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        JMenuBar bar = new JMenuBar();
        JMenu jm = new JMenu("查看(V)");
        JMenu jm2 = new JMenu("编辑(E)");
        JMenu jm3 = new JMenu("帮助(H)");
        bar.add(jm);
        bar.add(jm2);
        bar.add(jm3);
        this.setJMenuBar(bar);
        text.setLayout(null);
        text.setBounds(10,10,370,70);
        text.setAlignmentX(RIGHT_ALIGNMENT);
        text.setBorder(BorderFactory.createEtchedBorder());
        text.setEditable(false);
        jPanel.setBounds(0,90,390,270);
        jPanel.setLayout(new GridLayout(7,3,1,1));
        for(int i=0;i<str.length;i++){
            strs[i] = new JButton();
            strs[i].setText(str[i]);
            jPanel.add(strs[i]);
            strs[i].addActionListener(this);
        }
        this.add(jPanel);
        this.add(text);
        this.setVisible(true);





    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String label = actionEvent.getActionCommand();
        szong = "";
        if(label.equals("C")){
            szhen = "";
            a = 0;
            szong = "";
        }else if(!label.equals("←")&&!label.equals("=")){
            szong1[a] = label;
            for(int i=0;i<=a;i++){
                szong+=szong1[i];
            }
            a++;
            //sb.append(label);
        }else if(!label.equals("C")&&!label.equals("=")){
            if(a>0) {
                szong1[a - 1] = "";
                for (int i = 0; i <= a-1; i++) {
                    szong += szong1[i];
                }
                a--;
            }
        }
        text.setText(szong);
        if(label.equals("=")){
            for (int i = 0; i <= a-1; i++) {
                szhen += szong1[i];
            }
            Domain d = new Domain();
            List<String> infixlist = d.toInfixExpressionList(szhen);
            List<String> lis = d.parseSuffixExpressionList(infixlist);
            double res = d.calculate(lis);
            text.setText(""+res);
            for (int i = 0; i <= a-1; i++) {
                szong1[i] = "";
            }
            szhen = "";
            a = 0;
            szong = "";
        }
    }

}
