package bank;
import javax.swing.*;// to make ui
import java.awt.*; // to make ui
import java.awt.event.*; // to handle events like button clicks

public class Login extends JFrame implements ActionListener {

    JButton login, clear, signup; // declare the buttons as instance variables so that they can be accessed in the actionPerformed method
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
        cardnoText.setBounds(300, 150, 230, 30); 
        add(cardnoText); // add the JTextField to the JFrame

        //adding textbox in front of cardno and pin
        JTextField pinText = new JTextField();
        pinText.setBounds(300, 220, 230, 30); 
        add(pinText); // add the JTextField to the JFrame

        //adding login button
        JButton login = new JButton("Login");
        login.setBounds(300, 300, 100, 30); // set the bounds of the JButton
        login.setBackground(Color.BLACK); // set the background color of the JButton
        login.setForeground(Color.WHITE); // set the text color on the button to white
        login.addActionListener(this); // add an ActionListener to the JButton, so that it can handle button clicks
        add(login); // add the JButton to the JFrame

        //clear button
        JButton clear = new JButton("Clear");
        clear.setBounds(430, 300, 100, 30); // set the bounds of the JButton
        clear.setBackground(Color.BLACK); // set the background color of the JButton
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this); // add an ActionListener to the JButton, so that it can handle button clicks
        add(clear); // add the JButton to the JFrame

        //clear button
        JButton signup = new JButton("Sign Up");
        signup.setBounds(300, 350, 230, 30); // set the bounds of the JButton
        signup.setBackground(Color.BLACK); // set the background color of the JButton
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this); // add an ActionListener to the JButton, so that it can handle button clicks
        add(signup); // add the JButton to the JFrame


        setVisible(true); // make the JFrame visible

        setSize(800, 480);

        setLocation(350, 200); // center the JFrame on the screen
        //default frame opens from the left corner of the screen
    }

    public void actionPerformed(ActionEvent ae){

        //so when we use the actionListener interface, we need to override the actionPerformed method
        //the actionPerformed method is abstrcat in nature, it is just declared not defined
        //we will tell what will happen when we click the button

    }


    public static void main(String[] args) {
        new Login(); // create a new JFrame object
        //now that the JFrame obj is created, a constructor will be called

    }
}

