/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions;
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
 * @author shahirasadat
 */
public class OnlineTestQues extends JFrame implements ActionListener  {
    
    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnBookmark;
    ButtonGroup bg;
    int count= 0, current=0, x=1, y=1, now=0;
    int m[] = new int[10];
    
    
    OnlineTestQues(String msg){
        super(msg);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for(int i=0; i<5; i++){
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
        
        btnNext = new JButton("Next");
        btnBookmark = new JButton("Bookmark");
        btnNext.addActionListener(this);
        btnBookmark.addActionListener(this);
        add(btnNext);
        add(btnBookmark);
        set();
        label.setBounds(30, 40, 450, 20);
        radioButton[0].setBounds(50, 80, 100, 20);
        radioButton[1].setBounds(50, 110, 100, 20);
        radioButton[2].setBounds(50, 140, 100, 20);
        radioButton[3].setBounds(50, 170, 100, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnBookmark.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
        
    }
    void set(){
        radioButton[4].setSelected(true);
        if(current == 0){
            label.setText("Question1: Which one among these is not a primitive datatype?");
            radioButton[0].setText("int");
            radioButton[1].setText("float");
            radioButton[2].setText("boolean");
            radioButton[3].setText("char");
        }
            
            
            if(current == 1){
            label.setText("Question2: Which class is available to all the class automatically?");
            radioButton[0].setText("Swing");
            radioButton[1].setText("Applet");
            radioButton[2].setText("Object");
            radioButton[3].setText("ActionEvent");
            }
            
            if(current == 2){
            label.setText("Question3: Which package is directly available to our class without importing it?");
            radioButton[0].setText("Swing");
            radioButton[1].setText("Applet");
            radioButton[2].setText("net");
            radioButton[3].setText("lang");
            }
            
            if(current == 3){
            label.setText("Question4: String class is defined in which package?");
            radioButton[0].setText("Lang");
            radioButton[1].setText("Swing");
            radioButton[2].setText("Applet");
            radioButton[3].setText("Awt");
            }
            
            if(current == 4){
            label.setText("Question5: Which institute is best for java coaching?");
            radioButton[0].setText("Utek");
            radioButton[1].setText("Aptech");
            radioButton[2].setText("SSS IT");
            radioButton[3].setText("jtek");
            }
            
            if(current == 5){
            label.setText("Question6: Which one among these is not a keyword?");
            radioButton[0].setText("class");
            radioButton[1].setText("int");
            radioButton[2].setText("get");
            radioButton[3].setText("if");
            }
            
            if(current == 6){
            label.setText("Question7: Which one among these is not a class?");
            radioButton[0].setText("Swing");
            radioButton[1].setText("Actionperformed");
            radioButton[2].setText("ActionEvent");
            radioButton[3].setText("Button");  
        }
            
            if(current == 7){
            label.setText("Question8: which one among these is not a function of Object class?");
            radioButton[0].setText("toString");
            radioButton[1].setText("finalize");
            radioButton[2].setText("equals");
            radioButton[3].setText("getDocumentBase");  
        }
            
            
            if(current == 8){
            label.setText("Question9: which function is not present in Applet class?");
            radioButton[0].setText("init");
            radioButton[1].setText("main");
            radioButton[2].setText("start");
            radioButton[3].setText("destroy");  
        }
            
            if(current == 9){
            label.setText("Question10: Which one among these is not a valid component?");
            radioButton[0].setText("JButton");
            radioButton[1].setText("JList");
            radioButton[2].setText("JButtonGroup");
            radioButton[3].setText("JTextArea");  
        }
            
            
        label.setBounds(30, 40, 450, 20);
        for(int i=0,j=0; i<=90; i+=30, j++){
            radioButton[j].setBounds(50, 80+i, 200,20);
        }}
        
        boolean check() {
            if(current == 0)
                return(radioButton[1].isSelected());
            if(current == 1)
                return(radioButton[2].isSelected());
            if(current == 2)
                return(radioButton[3].isSelected());
            if(current == 3)
                return(radioButton[0].isSelected());
            if(current == 4)
                return(radioButton[2].isSelected());
            if(current == 5)
                return(radioButton[2].isSelected());
            if(current == 6)
                return(radioButton[1].isSelected());
            if(current == 7)
                return(radioButton[3].isSelected());
            if(current == 8)
                return(radioButton[1].isSelected());
            if(current == 9)
                return(radioButton[2].isSelected());
            return false;
        
        
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==btnNext)  
        {  
            if(check())  
                count=count+1;  
            current++;  
            set();    
            if(current==9)  
            {  
                btnNext.setEnabled(false);  
                btnBookmark.setText("Result");  
            }  
        }  
        if(e.getActionCommand().equals("Bookmark"))  
        {  
            JButton bk=new JButton("Bookmark"+x);  
            bk.setBounds(480,20+30*x,100,30);  
            add(bk);  
            bk.addActionListener(this);  
            m[x]=current;  
            x++;  
            current++;  
            set();    
            if(current==9)  
                btnBookmark.setText("Result");  
            setVisible(false);  
            setVisible(true);  
        }  
        for(int i=0,y=1;i<x;i++,y++)  
        {  
        if(e.getActionCommand().equals("Bookmark"+y))  
        {  
            if(check())  
                count=count+1;  
            now=current;  
            current=m[y];  
            set();  
            ((JButton)e.getSource()).setEnabled(false);  
            current=now;  
        }  
        }  
      
        if(e.getActionCommand().equals("Result"))  
        {  
            if(check())  
                count=count+1;  
            current++;  
            //System.out.println("correct ans="+count);  
            JOptionPane.showMessageDialog(this,"correct ans="+count);  
            System.exit(0);  
        }  
      
       
        
    }
    
    public static void main(String[] args) {
         new OnlineTestQues("Online Test App");
      
         }
            
    }
    

