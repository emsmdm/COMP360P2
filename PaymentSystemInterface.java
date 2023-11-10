import java.util.*;
import java.util.jar.JarEntry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentSystemInterface {
    public JFrame SystemFrame;
    public JPanel input1;
    public JPanel input2;
    public JPanel input3;
    public JButton submit;
    public JButton clear;
    public JTextField lastNameText;
    public JTextField firstNameText;
    public JTextField addressText;
    public JTextField idText;
    public JTextField summerCourseTitleText;
    public JTextField salaryText;
    public JLabel lastName;
    public JLabel firstName;
    public JLabel address;
    public JLabel prompt1;
    public JLabel prompt2;
    public JLabel id;
    public JLabel salary;
    public JLabel summerCourseTitle;
    public JLabel employeePick;
    public JLabel teachingSummerLabel;
    public JLabel grantOverMilLabel;
    public JLabel submitLabel;
    public JLabel clearLabel;
    public JComboBox employeePickBox;
    public JComboBox grantOverMil;
    public JComboBox teachingSummer;
    
    GridBagLayout gbl;
    GridBagConstraints gbc;

    public PaymentSystemInterface() {
        SystemFrame = new JFrame("ABC University Payment System");
        SystemFrame.setSize(600, 600);
        SystemFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		SystemFrame.setLayout(gbl);
		SystemFrame.setVisible(true);

        input1 = new JPanel();
		input1.setLayout(gbl);
		input2 = new JPanel();
		input2.setLayout(gbl);
        input3 = new JPanel();
        input3.setLayout((gbl));

        gbc.gridx = 0;
		gbc.gridy = 0;
		SystemFrame.add(input1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		SystemFrame.add(input2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        SystemFrame.add(input3, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(3, 3, 3, 3);

        employeePick = new JLabel("Employee Type");
        gbc.gridx = 0;
        gbc.gridy = 0;
        input1.add(employeePick, gbc);

        String[] employeeTypes = {"Lecturer", "Assistant Professor", "Professor"};

        employeePickBox = new JComboBox(employeeTypes);
        gbc.gridx = 1;
        gbc.gridy = 0;
        input1.add(employeePickBox, gbc);


        lastName = new JLabel("Last Name: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		input1.add(lastName, gbc);
		
		lastNameText = new JTextField(10); //parameter determines how many characters you can see at a time
		gbc.gridx = 1;
		gbc.gridy = 1;
		input1.add(lastNameText, gbc);

        firstName = new JLabel("First Name: ");
		gbc.gridx = 2;
		gbc.gridy = 1;
		input1.add(firstName, gbc);
		
		firstNameText = new JTextField(10); //parameter determines how many characters you can see at a time
		gbc.gridx = 3;
		gbc.gridy = 1;
		input1.add(firstNameText, gbc);

        address = new JLabel("Address: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		input1.add(address, gbc);
		
		addressText = new JTextField(10); //parameter determines how many characters you can see at a time
		gbc.gridx = 1;
		gbc.gridy = 2;
		input1.add(addressText, gbc);

        id = new JLabel("ID:");
        gbc.gridx = 2;
        gbc.gridy = 2;
        input1.add(id, gbc);

        idText = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 2;
        input1.add(idText, gbc);
        
        salary = new JLabel("Salary:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        input1.add(salary, gbc);

        salaryText = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 3;
        input1.add(salaryText, gbc);

        prompt1 = new JLabel("Answer the following questions for Professors and Assistant Professors.");
        //prompt1.setHorizontalAlignment(JLabel.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 1;
        SystemFrame.add(prompt1, gbc);

        teachingSummerLabel = new JLabel("Teaching a summer class?");
        gbc.gridx = 0;
        gbc.gridy = 0;
        input2.add(teachingSummerLabel, gbc);

        String[] yesNo = {"Yes", "No"};

        teachingSummer = new JComboBox<>(yesNo);
        gbc.gridx = 1;
        gbc.gridy = 0;
        input2.add(teachingSummer, gbc);

        summerCourseTitle = new JLabel("If yes, enter the class name:");
        gbc.gridx = 2;
        gbc.gridy = 0;
        input2.add(summerCourseTitle, gbc);

        summerCourseTitleText = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 0;
        input2.add(summerCourseTitleText, gbc);

        prompt2 = new JLabel("Answer the following question for Professors only.");
        gbc.gridx = 0;
        gbc.gridy = 3;
        SystemFrame.add(prompt2, gbc);

        grantOverMilLabel = new JLabel("Has the professor received a grant MORE than $1,000,000?");
        gbc.gridx = 0;
        gbc.gridy = 0;
        input3.add(grantOverMilLabel, gbc);

        grantOverMil = new JComboBox<>(yesNo);
        gbc.gridx = 1;
        gbc.gridy = 0;
        input3.add(grantOverMil, gbc);

        submitLabel = new JLabel("Click the button below to submit the form.");
        gbc.gridx = 0;
        gbc.gridy = 1;
        input3.add(submitLabel, gbc);

        submit = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 2;
        input3.add(submit, gbc);

        clearLabel = new JLabel("Click the button below to clear the form.");
        gbc.gridx = 0;
        gbc.gridy = 3;
        input3.add(clearLabel, gbc);

        clear = new JButton("Clear");
        gbc.gridx = 0;
        gbc.gridy = 4;
        input3.add(clear, gbc);



        clear.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lastNameText.setText("");
				firstNameText.setText("");
				addressText.setText("");
				idText.setText("");
				summerCourseTitleText.setText("");
				salaryText.setText("");
			}
		});





    }

    public static void main(String[] args) {
        PaymentSystemInterface ABCPayment = new PaymentSystemInterface();
    }
}
