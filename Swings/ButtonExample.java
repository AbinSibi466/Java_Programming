package Swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ButtonExample {
    public static void main(String[] args){
             JFrame f = new JFrame("Button Exzmple");
             final JTextField tf = new JTextField();
             tf.setBounds(50,50,150,20);
             JButton b= new JButton("Click Here");
             b.setBounds(50,100,95,30);
             b.addActionListener((ActionListener) new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    tf.setText("Welcon to java");
                }
             });
             f.add(b);
             f.add(tf);
             f.setSize(400,400);
             f.setLayout(null);
             f.setVisible(true);
    }
   
    
}
