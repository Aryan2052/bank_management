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

        JLabel personDetails = new JLabel("page 1 Personal Details: "); // create a label for the form number
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22)); // set the font of the label
        personDetails.setBounds(290, 80, 400, 30); // set the position and size of the label
        add(personDetails); // add the label to the JFrame
        

        JLabel name = new JLabel("Name: "); // create a label for the form number
        name.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        name.setBounds(100, 140, 100, 30); // set the position and size of the label
        add(name); // add the label to the JFrame


        JLabel fname = new JLabel("Fathers name: "); // create a label for the form number
        fname.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        fname.setBounds(100, 190, 200, 30); // set the position and size of the label
        add(fname); // add the label to the JFrame

        JLabel dob = new JLabel("Date of birth: "); // create a label for the form number
        dob.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        dob.setBounds(100, 240, 200, 30); // set the position and size of the label
        add(dob); // add the label to the JFrame

        JLabel gender = new JLabel("Gender: "); // create a label for the form number
        gender.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        gender.setBounds(100, 290, 200, 30); // set the position and size of the label
        add(gender); // add the label to the JFrame

        JLabel email = new JLabel("Email: "); // create a label for the form number
        email.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        email.setBounds(100, 340, 200, 30); // set the position and size of the label
        add(email); // add the label to the JFrame

        JLabel marital = new JLabel("Marital Status: "); // create a label for the form number
        marital.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        marital.setBounds(100, 390, 200, 30); // set the position and size of the label
        add(marital); // add the label to the JFrame

        JLabel address = new JLabel("Address: "); // create a label for the form number
        address.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        address.setBounds(100, 440, 200, 30); // set the position and size of the label
        add(address); // add the label to the JFrame

        JLabel city = new JLabel("City: "); // create a label for the form number
        city.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        city.setBounds(100, 490, 200, 30); // set the position and size of the label
        add(city); // add the label to the JFrame

        JLabel state = new JLabel("State: "); // create a label for the form number
        state.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        state.setBounds(100, 540, 200, 30); // set the position and size of the label
        add(state); // add the label to the JFrame

        JLabel country = new JLabel("Country: "); // create a label for the form number
        country.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        country.setBounds(100, 590, 200, 30); // set the position and size of the label
        add(country); // add the label to the JFrame
        
        
        getContentPane().setBackground(java.awt.Color.WHITE); // set the background color of the JFrame
        
        setSize(850, 800); // set the size of the JFrame
        setLocation(350, 10); // center the JFrame on the screen // set the title of the JFrame
        setVisible(true); // make the JFrame visible
    }


    public static void main(String[] args) {
        new SignupOne(); // create an instance of SignupOne to display the JFrame
    }

    
}
