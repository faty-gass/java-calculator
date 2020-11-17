import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.GridBagConstraints;

public class Window extends JFrame {
    public Window(String title, int height, int width){
        super(title);
        setVisible(true);
        setSize(width, height);
        //setLayout(new GridBagLayout());
    }

    static JLabel label = new JLabel();

    static Button btn1 = new Button("1",0,0);
    static Button btn2 = new Button("2",40,0);
    static Button btn3 = new Button("3",80,0);
    static Button btnAdd = new Button("+",120,0);
    static Button btn4 = new Button("4",0,40);
    static Button btn5 = new Button("5",40,40);
    static Button btn6 = new Button("6",80,40);
    static Button btnSub = new Button("-",120,40);
    static Button btn7 = new Button("7",0,80);
    static Button btn8 = new Button("8",40, 80);
    static Button btn9 = new Button("9",80,80);
    static Button btnMul = new Button("x",120,80);
    static Button btnReset = new Button("C",0,120);
    static Button btn0 = new Button("0",40,120);
    static Button btnComp = new Button("=",80,120);
    static Button btnDiv = new Button("/",120,120);
    
    static Button[] buttons = {btn1,btn2,btn3,btnAdd, btn4,btn5,btn6,btnSub, btn7,btn8,btn9,btnMul, btnReset,btn0,btnComp,btnDiv};

    String printedText;

    public static void main(String[] args) {
        Window myWindow = new Window("Calculator", 600, 400);
        
        label.setText("0");

        myWindow.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0;
        c.gridy=0;
        c.fill=GridBagConstraints.HORIZONTAL; 
        c.gridwidth=4;
        c.weightx=1;
        c.weighty=1;
        myWindow.add(label,c);
        c.gridx=0;
        c.gridy=1;
        c.fill=GridBagConstraints.BOTH; 
        c.gridwidth=1;
        c.weighty=1;
        myWindow.add(btn1,c);
        btn1.addActionListener(btn1);
        c.gridx=1;
        c.gridy=1;
        myWindow.add(btn2,c);
        btn2.addActionListener(btn2);
        c.gridx=2;
        c.gridy=1;
        myWindow.add(btn3,c);
        btn3.addActionListener(btn3);
        c.gridx=3;
        c.gridy=1;
        myWindow.add(btnAdd,c);
        btnAdd.addActionListener(btnAdd);
        btnAdd.setOpaque(false);
        btnAdd.setBackground(Color.BLACK);
        c.gridx=0;
        c.gridy=2;
        myWindow.add(btn4,c);
        btn4.addActionListener(btn4);
        c.gridx=1;
        c.gridy=2;
        myWindow.add(btn5,c);
        btn5.addActionListener(btn5);
        c.gridx=2;
        c.gridy=2;
        myWindow.add(btn6,c);
        btn6.addActionListener(btn6);
        c.gridx=3;
        c.gridy=2;
        myWindow.add(btnSub,c);
        btnSub.addActionListener(btnSub);
        btnSub.setOpaque(false);
        btnSub.setBackground(Color.BLACK);
        c.gridx=0;
        c.gridy=3;
        myWindow.add(btn7,c);
        btn7.addActionListener(btn7);
        c.gridx=1;
        c.gridy=3;
        myWindow.add(btn8,c);
        btn8.addActionListener(btn8);
        c.gridx=2;
        c.gridy=3;
        myWindow.add(btn9,c);
        btn9.addActionListener(btn9);
        c.gridx=3;
        c.gridy=3;
        myWindow.add(btnMul,c);
        btnMul.addActionListener(btnMul);
        btnMul.setOpaque(false);
        btnMul.setBackground(Color.BLACK);
        c.gridx=0;
        c.gridy=4;
        myWindow.add(btnReset,c);
        btnReset.addActionListener(btnReset);
        btnReset.setOpaque(false);
        btnReset.setBackground(Color.BLACK);
        c.gridx=1;
        c.gridy=4;
        myWindow.add(btn0,c);
        btn0.addActionListener(btn0);
        c.gridx=2;
        c.gridy=4;
        myWindow.add(btnComp,c);
        btnComp.addActionListener(btnComp);
        btnComp.setOpaque(false);
        btnComp.setBackground(Color.BLACK);
        c.gridx=3;
        c.gridy=4;
        myWindow.add(btnDiv,c);
        btnDiv.addActionListener(btnDiv);
        btnDiv.setOpaque(false);
        btnDiv.setBackground(Color.BLACK);
    }
}
