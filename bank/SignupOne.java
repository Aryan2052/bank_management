package bank;
import javax.swing.*; // to make ui
import java.awt.*; // to set the background color of the JFrame
import java.util.*;

public class SignupOne extends JFrame {

    SignupOne(){

        //by default the layout is centre/border layout
        setLayout(null);

        Random ran = new Random(); // create an instance of the random class to generate a random number
        long random = Math.abs((ran.nextLong()%9000L+1000L));

        JLabel formno = new JLabel("APPLICATION FORM NO. "+random); // create a label for the form number
        formno.setFont(new Font("Raleway", Font.BOLD, 38)); // set the font of the label
        formno.setBounds(140, 20, 600, 40); // set the position and size of the label
        add(formno); // add the label to the JFrame
        getContentPane().setBackground(java.awt.Color.WHITE); // set the background color of the JFrame
        
        setSize(850, 800); // set the size of the JFrame
        setLocation(350, 10); // center the JFrame on the screen // set the title of the JFrame
        setVisible(true); // make the JFrame visible
    }


    public static void main(String[] args) {
        new SignupOne(); // create an instance of SignupOne to display the JFrame
    }

    
}
