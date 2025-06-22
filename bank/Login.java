package bank;
import javax.swing.*;// to make ui

public class Login extends JFrame{
    //Login constructor
    Login(){
         // set the size of the JFrame
        setTitle("Bank Management System"); // set the title of the JFrame
        

        ImageIcon i1 = new ImageIcon("icons/logo.jpg");
        //we are basically adding the label obj of the JLabel class to the JFrame
        JLabel label = new JLabel(i1); // create a JLabel with the image
        add(label); // add the JLabel to the JFrame
        

        setVisible(true); // make the JFrame visible

        setSize(800, 480);

        setLocation(350, 200); // center the JFrame on the screen
        //default frame opens from the left corner of the screen
    }


    public static void main(String[] args) {
        new Login(); // create a new JFrame object
        //now that the JFrame obj is created, a constructor will be called

    }
}

