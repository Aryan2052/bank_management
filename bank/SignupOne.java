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

        JTextField nameField = new JTextField(); // create a text field for the name
        nameField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        nameField.setBounds(300, 140, 400, 30); // set the position and size of the text field
        add(nameField); // add the text field to the JFrame


        JLabel fname = new JLabel("Fathers name: "); // create a label for the form number
        fname.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        fname.setBounds(100, 190, 200, 30); // set the position and size of the label
        add(fname); // add the label to the JFrame

        JTextField fnameField = new JTextField(); // create a text field for the name
        fnameField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        fnameField.setBounds(300, 190, 400, 30); // set the position and size of the text field
        add(fnameField); // add the text field to the JFrame

        JLabel dob = new JLabel("Date of birth: "); // create a label for the form number
        dob.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        dob.setBounds(100, 240, 200, 30); // set the position and size of the label
        add(dob); // add the label to the JFrame

        // Date dropdown components
        String[] days = new String[31];
        for(int i = 1; i <= 31; i++) {
            days[i-1] = String.valueOf(i);
        }
        
        String[] months = {"January", "February", "March", "April", "May", "June", 
                          "July", "August", "September", "October", "November", "December"};
        
        String[] years = new String[100];
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        for(int i = 0; i < 100; i++) {
            years[i] = String.valueOf(currentYear - i);
        }
        
        JComboBox<String> dayCombo = new JComboBox<>(days);
        dayCombo.setBounds(300, 240, 80, 30);
        dayCombo.setBackground(Color.WHITE);
        add(dayCombo);
        
        JComboBox<String> monthCombo = new JComboBox<>(months);
        monthCombo.setBounds(390, 240, 120, 30);
        monthCombo.setBackground(Color.WHITE);
        add(monthCombo);
        
        JComboBox<String> yearCombo = new JComboBox<>(years);
        yearCombo.setBounds(520, 240, 80, 30);
        yearCombo.setBackground(Color.WHITE);
        add(yearCombo);

        JLabel gender = new JLabel("Gender: "); // create a label for the form number
        gender.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        gender.setBounds(100, 290, 200, 30); // set the position and size of the label
        add(gender); // add the label to the JFrame

        //radio buttons
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30); // set the position and size of the radio button
        male.setBackground(Color.WHITE); // set the background color of the radio button
        add(male); // add the radio button to the JFrame

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(450, 290, 70, 30); // set the position and size of the radio button
        female.setBackground(Color.WHITE);
        add(female); // add the radio button to the JFrame

        //earlier when we clicked the radio button we could select both male female simultaneously
        ButtonGroup genderGroup = new ButtonGroup(); // create a button group to group the radio buttons
        genderGroup.add(male);
        genderGroup.add(female);


        JLabel email = new JLabel("Email: "); // create a label for the form number
        email.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        email.setBounds(100, 340, 200, 30); // set the position and size of the label
        add(email); // add the label to the JFrame

        JTextField emailField = new JTextField(); // create a text field for the name
        emailField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        emailField.setBounds(300, 340, 400, 30); // set the position and size of the text field
        add(emailField); // add the text field to the JFrame

        JLabel marital = new JLabel("Marital Status: "); // create a label for the form number
        marital.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        marital.setBounds(100, 390, 200, 30); // set the position and size of the label
        add(marital); // add the label to the JFrame

        //radio buttons
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30); // set the position and size of the radio button
        married.setBackground(Color.WHITE); // set the background color of the radio button
        add(married); // add the radio button to the JFrame

        JRadioButton unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30); // set the position and size of the radio button
        unmarried.setBackground(Color.WHITE);
        add(unmarried); // add the radio button to the JFrame

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30); // set the position and size of the radio button
        other.setBackground(Color.WHITE);
        add(other); // add the radio button to the JFrame

        //earlier when we clicked the radio button we could select both male female simultaneously
        ButtonGroup maritalGroup = new ButtonGroup(); // create a button group to group the radio buttons
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address: "); // create a label for the form number
        address.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        address.setBounds(100, 440, 200, 30); // set the position and size of the label
        add(address); // add the label to the JFrame

        JTextField addressField = new JTextField(); // create a text field for the name
        addressField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        addressField.setBounds(300, 440, 400, 30); // set the position and size of the text field
        add(addressField); // add the text field to the JFrame

        JLabel city = new JLabel("City: "); // create a label for the form number
        city.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        city.setBounds(100, 490, 200, 30); // set the position and size of the label
        add(city); // add the label to the JFrame

        JTextField cityField = new JTextField(); // create a text field for the name
        cityField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        cityField.setBounds(300, 490, 400, 30); // set the position and size of the text field
        add(cityField); // add the text field to the JFrame

        JLabel state = new JLabel("State: "); // create a label for the form number
        state.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        state.setBounds(100, 540, 200, 30); // set the position and size of the label
        add(state); // add the label to the JFrame

        JTextField stateField = new JTextField(); // create a text field for the name
        stateField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        stateField.setBounds(300, 540, 400, 30); // set the position and size of the text field
        add(stateField); // add the text field to the JFrame

        JLabel Pincode = new JLabel("Pincode: "); // create a label for the form number
        Pincode.setFont(new Font("Raleway", Font.BOLD, 20)); // set the font of the label
        Pincode.setBounds(100, 590, 200, 30); // set the position and size of the label
        add(Pincode); // add the label to the JFrame

        JTextField pinField = new JTextField(); // create a text field for the name
        pinField.setFont(new Font("Raleway", Font.BOLD, 14)); // set the font of the text field
        pinField.setBounds(300, 590, 400, 30); // set the position and size of the text field
        add(pinField); // add the text field to the JFrame
        
        
        getContentPane().setBackground(java.awt.Color.WHITE); // set the background color of the JFrame
        
        setSize(850, 800); // set the size of the JFrame
        setLocation(350, 10); // center the JFrame on the screen // set the title of the JFrame
        setVisible(true); // make the JFrame visible
    }


    public static void main(String[] args) {
        new SignupOne(); // create an instance of SignupOne to display the JFrame
    }

    
}
