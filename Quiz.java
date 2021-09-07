/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author HP
 */
public class Quiz extends JFrame implements ActionListener {
    
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    
    
    Quiz(String s){
    super(s);
    label = new JLabel();
    add(label);
    bg = new ButtonGroup();
    for(int i = 0; i < 5; i++){
    radioButtons[i] = new JRadioButton();
    add(radioButtons[i]);
    bg.add(radioButtons[i]);
            }
    
    btnNext = new JButton("Next");
    btnResult = new JButton("Result");
    btnResult.setVisible(false);
    btnResult.addActionListener(this);
    btnNext.addActionListener(this);
    add(btnNext);
    add(btnResult);
    setData();
    label.setBounds(30, 40, 450, 20);
    radioButtons[0].setBounds(50,80,450,20);
    radioButtons[1].setBounds(50,110,200,20);
    radioButtons[2].setBounds(50,140,200,20);
    radioButtons[3].setBounds(50,170,200,20);
    btnNext.setBounds(100,240,100,30);
    btnResult.setBounds(270,240,100,30);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setLocation(250,100);
    setVisible(true);
    setSize(600,350);
    
    
    
    }
    
    void setData(){
        radioButtons[4].setSelected(true);
        if(current == 0){
        label.setText("Q1: which is official language for Android Development");
        radioButtons[0].setText("Java");
        radioButtons[1].setText("Kotline");
        radioButtons[2].setText("C++");
        radioButtons[3].setText("JavaScript");
        
        
        }
        if(current == 1){
        label.setText("Q2:  Which of the following option leads to the portability and security of Java?");
        radioButtons[0].setText("Bytecode is executed by JVM");
        radioButtons[1].setText("The applet makes the Java code secure and portable");
        radioButtons[2].setText("Use of exception handling");
        radioButtons[3].setText("Dynamic binding between objects");
        
        
        }
        //ans=use of pointers
        if(current == 2){
        label.setText("Q3:  Which of the following is not a Java features?");
        radioButtons[0].setText("Dynamic");
        radioButtons[1].setText("Architecture Neutral");
        radioButtons[2].setText("Use of pointers");
        radioButtons[3].setText("Object-oriented");
        
        
        }
        //ans = unicode escape sequence
        if(current == 3){
        label.setText("Q4: The \\u0021 article referred to as a");
        radioButtons[0].setText("Unicode escape sequence");
        radioButtons[1].setText("Octal escape");
        radioButtons[2].setText("Hexadecimal");
        radioButtons[3].setText("Line feed");
        
        
        }
        //ans = \\utea
        if(current == 4){
        label.setText("Q5:  Which of the following is a valid declaration of a char?");
        radioButtons[0].setText("char ch = '\\utea';");
        radioButtons[1].setText("char ca = 'tea';");
        radioButtons[2].setText("char cr = \\u0223;");
        radioButtons[3].setText("char cc = '\\itea';");
        
        
        }
        //ans = JDB
        if(current == 5){
        label.setText("Q6: _____ is used to find and fix bugs in the Java programs.");
        radioButtons[0].setText("JVM");
        radioButtons[1].setText("JRE");
        radioButtons[2].setText("JDK");
        radioButtons[3].setText("JDB");
        
        
        }
        //ans = int
        if(current == 6){
        label.setText("Q7: What is the return type of the hashCode() method in the Object class?");
        radioButtons[0].setText("Object");
        radioButtons[1].setText("int");
        radioButtons[2].setText("long");
        radioButtons[3].setText("void");
        
        
        }
        // ans = infinity
        if(current == 7){
        label.setText("Q8: What does the expression float a = 35 / 0 return?");
        radioButtons[0].setText("0");
        radioButtons[1].setText("Not a Number");
        radioButtons[2].setText("Infinity");
        radioButtons[3].setText("Run time exception");
        
        
        }
        //ans = variable shadowing
        if(current == 8){
        label.setText("Q9: In which process, a local variable has the same name as one of the instance variables?");
        radioButtons[0].setText("Serialization");
        radioButtons[1].setText("Variable Shadowing");
        radioButtons[2].setText("Abstraction");
        radioButtons[3].setText("Multi-threading");
        
        
        }
        //It has no class name
        if(current == 9){
        label.setText("Q10:  Which of the following is true about the anonymous inner class?");
        radioButtons[0].setText("It has only methods");
        radioButtons[1].setText("Objects can't be created");
        radioButtons[2].setText("It has a fixed class name");
        radioButtons[3].setText("It has no class name");
        
        
        }
        label.setBounds(30,40,450,20);
        for(int i = 0,j=0; i <= 90; i+=30,j++){
            radioButtons[j].setBounds(50,80+i,200,20);
        }
        
    }
    boolean checkAns(){
    if(current == 0){
        return(radioButtons[1].isSelected());
    }
    if(current == 1){
        return(radioButtons[0].isSelected());
    }
    if(current == 2){
        return(radioButtons[2].isSelected());
    }
    if(current == 3){
        return(radioButtons[0].isSelected());
    }
    if(current == 4){
        return(radioButtons[0].isSelected());
    }
    if(current == 5){
        return(radioButtons[3].isSelected());
    }
    if(current == 6){
        return(radioButtons[1].isSelected());
    }
    if(current == 7){
        return(radioButtons[2].isSelected());
    }if(current == 8){
        return(radioButtons[1].isSelected());
    }if(current == 9){
        return(radioButtons[3].isSelected());
    }
    
    
    
    return false;
    }   
    /**
     *
     * @param args
     */
    public static void main(String args[]){
        new Quiz("Simple Quiz App");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnNext){
            if(checkAns())
                count  = count + 1;
            current ++;
            setData();
            if(current == 9){
                btnNext.setEnabled(false);
                btnResult.setVisible(true);
                btnResult.setText("Result");
            }
    }
    if(e.getActionCommand().equals("Result")){
        if(checkAns())
            count  = count + 1;
        current++;
        JOptionPane.showMessageDialog(this, "Correct Answers are"+count);
        System.exit(0);
    }
    }
}
