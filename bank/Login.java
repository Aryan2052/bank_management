package bank;
import javax.swing.*;// to make ui
import java.awt.*; // to make ui

public class Login extends JFrame{
    //Login constructor
    Login(){
         // set the size of the JFrame

        setTitle("Bank Management System"); // set the title of the JFrame
        
        setLayout(null); // set the layout of the JFrame to null, so we can use our own positioning
        //null layout means we can set the position of the components manually, i.e we can
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); // scale the image to fit the JFrame
        //we are basically adding the label obj of the JLabel class to the JFrame
        //we cant directly put the i2 image in Jlabel, we need a ImageIcon object
        //ImageIcon is a class that represents an image in Java Swing

        ImageIcon i3 = new ImageIcon(i2); // create a new ImageIcon with the scaled image
        JLabel label = new JLabel(i3); // create a JLabel with the image
        label.setBounds(70, 10, 100, 100); // set the bounds of the JLabel to cover the entire JFrame, i.e lhs of image

        add(label); // add the JLabel to the JFrame

        getContentPane().setBackground(Color.WHITE); // set the background color of the JFrame to white

        JLabel text = new JLabel("Welcome to ATM");
        text.setBounds(200, 40, 400, 40);
        text.setFont(new Font("Osward", Font.BOLD, 38));
         // set the font of the JLabel
        add(text); // add the JLabel to the JFrame
             
        JLabel cardno = new JLabel("Card No:");
        cardno.setBounds(120, 150, 150, 40);
        cardno.setFont(new Font("Raleway", Font.BOLD, 28)); // set the font of the JLabel
        add(cardno); // add the JLabel to the JFrame
        
        JLabel pin = new JLabel("PIN:");
        pin.setBounds(120, 220, 250, 40);
        pin.setFont(new Font("Osward", Font.BOLD, 28)); // set the font of the JLabel
        add(pin); // add the JLabel to the JFrame
        

        //adding textbox in front of cardno and pin
        JTextField cardnoText = new JTextField();
        cardnoText.setBounds(300, 150, 250, 40); 
        add(cardnoText); // add the JTextField to the JFrame

        //adding textbox in front of cardno and pin
        JTextField pinText = new JTextField();
        pinText.setBounds(300, 220, 250, 40); 
        add(pinText); // add the JTextField to the JFrame

        

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

