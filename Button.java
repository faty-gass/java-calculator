import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.*;

public class Button extends JButton implements ActionListener {
    public Button (String text, int xPosition, int yPosition){
        super(text);
        //setLocation(xPosition, yPosition);
    }

    static String pressedBtn;
    static String num1="";
    static String num2="";
    static String operateur="";


    public void actionPerformed(ActionEvent e){
        String pressed = e.getActionCommand();
        System.out.println(pressed + " clicked");

        if (pressed.charAt(0) >='0' && pressed.charAt(0) <= '9'){
        //char saisi est un num
            if (!operateur.equals("")){
                // si on a déjà stocké un opérateur le chiffre est stocké dans 2ème part de l'op°
                if (num2.equals("")){
                    // si premier char entré dans num2
                    num2=pressed;
                } else {
                    num2 += pressed;
                }    
                System.out.println(pressed + " is num2");
                Window.label.setText(num1 + operateur + num2);
            } else {
                //sinon on continue d'ajouter les chiffres a la 1ère part
                if (num1.equals("")){
                    // si premier char entré
                    num1=pressed;
                } else {
                    num1+=pressed; 
                }
                System.out.println(pressed + " is num1");
                Window.label.setText(num1);
            }
            // affichage op° en cours
            //Window.label.setText(num1 + operateur + num2);
        } else if (pressed.charAt(0)=='C'){
            // si char reset, efface data + affiche 0
            num1 = num2 = operateur = "";
            Window.label.setText("0");
        } else if (pressed.charAt(0) == '='){
            // si = effectue calculator operations
            Double result=0.00 ;
            Double var1= Double.parseDouble(num1);
            Double var2= Double.parseDouble(num2);
            if (operateur.equals("+")){
                result = Calculator.add(var1, var2);
            } else if (operateur.equals("-")){
                result = Calculator.substract(var1, var2);
            } else if (operateur.equals("x")){
                result = Calculator.multiply(var1, var2);
            } else if (operateur.equals("/")){
                result = Calculator.divide(var1, var2);
            }
            System.out.println(result + " is result after=");
            Window.label.setText(num1 + operateur + num2+ "=" + result);
            // part du résultat précédent
            //num1 = Double.toString(result);
            // reset data
            num1 = num2 = operateur = "";
        } else {
        // char saisi est un opérateur
            // verif que ce ne soit pas le tout premier char
            if (!num1.equals("")){
                if (operateur.equals("") || num2.equals("")){
                    // si pas d'operateur stocké ou dernier char déjà opérateur maj
                    operateur=pressed;
                } else {
                    //si on a déjà expression complète avec opérateur
                    Double result=0.00 ;
                    Double var1= Double.parseDouble(num1);
                    Double var2= Double.parseDouble(num2);
                    if (operateur.equals("+")){
                        result = Calculator.add(var1, var2);
                    } else if (operateur.equals("-")){
                        result = Calculator.substract(var1, var2);
                    } else if (operateur.equals("x")){
                        result = Calculator.multiply(var1, var2);
                    } else if (operateur.equals("/")){
                        result = Calculator.divide(var1, var2);
                    }
                    // on effectue l'opération puis on utilise le résultat comme nouveau pt de départ
                    
                    num1 = Double.toString(result);
                    System.out.println(result + " is result after operation new num1");
                    operateur=pressed;
                    num2="";
                }
                Window.label.setText(num1 + operateur + num2);
            } else {
                Window.label.setText("0");
            }

            
            
        }
/*         if (pressedBtn == null || pressedBtn == "0"){
            // si premier char est chiffre alors on affiche
            if (pressed != "+" && pressed != "-" && pressed != "x" && pressed != "/" && pressed != "=" && pressed != "C"){
                pressedBtn=pressed;
            //si premier char est signe ne pas afficher
            } else {
                pressedBtn="0";
            }
        } else {
            // si !premier char n'est pas signe alors ajouter à l'affichage
            if (pressed != "+" && pressed != "-" && pressed != "x" && pressed != "/" && pressed != "=" && pressed != "C"){
                pressedBtn += pressed;
            } else {
                if (pressed == "+"){
                    num1= Double.parseDouble(pressedBtn);
                    pressedBtn="0";
                } else if (pressed== "=" || pressed== "C"){
                    pressedBtn="0";
                }
            } 
        } 
        
        Window.label.setText(pressedBtn); */
    }

}


