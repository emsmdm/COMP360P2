import java.util.*;
import java.util.jar.JarEntry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaymentSystemInterface {
    public JFrame SystemFrame;
    public JFrame doneFrame;
    public JFrame resultFrame;
    public JButton submit;
    public JButton done;
    public JButton go;
    public JButton clear;
    public JComboBox employeeList;
    public JPanel input1;
    public JPanel input2;
    public JPanel input3;
    public JPanel buttons;
    public JTextField lastNameText;
    public JTextField firstNameText;
    public JTextField addressText;
    public JTextField idText;
    public JTextField summerCourseTitleText;
    public JTextField salaryText;
    public JTextField grantText;
    public JTextArea results;
    public JLabel lastName;
    public JLabel firstName;
    public JLabel address;
    public JLabel prompt1;
    public JLabel prompt2;
    public JLabel salary;
    public JLabel summerCourseTitle;
    public JLabel employeePick;
    public JLabel teachingSummerLabel;
    public JLabel receiveGrantLabel;
    public JLabel submitLabel;
    public JLabel clearLabel;
    public JLabel selectTeacher;
    public JLabel id;
    public JLabel doneLabel;
    public JLabel grantLabel;
    public JComboBox employeePickBox;
    public JComboBox receiveGrant;
    public JComboBox teachingSummer;

    GridBagLayout gbl;
    GridBagConstraints gbc;

    //helper method for finding the index of an element of an array
    public static int findIndex(String arr[], String s) 
    {  
        if (arr == null) 
        { 
            return -1; 
        }  
        int i = 0; 
        while (i < arr.length)
        {  
            if (arr[i] == s) 
            { 
                return i; 
            } 
            else
            { 
                i = i + 1; 
            } 
        } 
        return -1; 
    }

    public PaymentSystemInterface() {
        //Creates the frame (main window) for the form
        SystemFrame = new JFrame("ABC University Payment System");
        SystemFrame.setSize(600, 600);
        SystemFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		SystemFrame.setLayout(gbl);
		SystemFrame.setVisible(true);

        //creating and adding each of the sections of the form
        //to the main window
        input1 = new JPanel();
		input1.setLayout(gbl);
		input2 = new JPanel();
		input2.setLayout(gbl);
        input3 = new JPanel();
        input3.setLayout(gbl);
        buttons = new JPanel();
        buttons.setLayout(gbl);

        gbc.gridx = 0;
		gbc.gridy = 0;
		SystemFrame.add(input1, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		SystemFrame.add(input2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        SystemFrame.add(input3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        SystemFrame.add(buttons, gbc);

		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(3, 3, 3, 3);

        //defining text boxes, drop down boxes, and labels for input
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
		
		lastNameText = new JTextField(10);
		gbc.gridx = 1;
		gbc.gridy = 1;
		input1.add(lastNameText, gbc);

        firstName = new JLabel("First Name: ");
		gbc.gridx = 2;
		gbc.gridy = 1;
		input1.add(firstName, gbc);
		
		firstNameText = new JTextField(10);
		gbc.gridx = 3;
		gbc.gridy = 1;
		input1.add(firstNameText, gbc);

        address = new JLabel("Address: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		input1.add(address, gbc);
		
		addressText = new JTextField(10);
		gbc.gridx = 1;
		gbc.gridy = 2;
		input1.add(addressText, gbc);

        id = new JLabel("ID #:");
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

        prompt2 = new JLabel("Answer the following questions for Professors only.");
        gbc.gridx = 0;
        gbc.gridy = 3;
        SystemFrame.add(prompt2, gbc);

        receiveGrantLabel = new JLabel("Has the professor received a grant?");
        gbc.gridx = 0;
        gbc.gridy = 0;
        input3.add(receiveGrantLabel, gbc);

        receiveGrant = new JComboBox<>(yesNo);
        gbc.gridx = 1;
        gbc.gridy = 0;
        input3.add(receiveGrant, gbc);

        grantLabel = new JLabel("If yes, enter the grant amount:");
        gbc.gridx = 2;
        gbc.gridy = 0;
        input3.add(grantLabel, gbc);

        grantText = new JTextField(10);
        gbc.gridx = 3;
        gbc.gridy = 0;
        input3.add(grantText, gbc);

        //defining buttons used to submit the form
        submitLabel = new JLabel("Click the button below to submit the form.");
        gbc.gridx = 0;
        gbc.gridy = 0;
        buttons.add(submitLabel, gbc);

        submit = new JButton("Submit");
        gbc.gridx = 0;
        gbc.gridy = 1;
        buttons.add(submit, gbc);

        doneLabel = new JLabel("Click the button below when you are done entering information for ALL employees");
        gbc.gridx = 0;
        gbc.gridy = 2;
        buttons.add(doneLabel, gbc);

        done = new JButton("Done");
        gbc.gridx = 0;
        gbc.gridy = 3;
        buttons.add(done, gbc);

        clearLabel = new JLabel("Click the button below to clear the form.");
        gbc.gridx = 0;
        gbc.gridy = 4;
        buttons.add(clearLabel, gbc);

        clear = new JButton("Clear");
        gbc.gridx = 0;
        gbc.gridy = 5;
        buttons.add(clear, gbc);

        //ArrayList to store all of the Employee objects
        //Employee covers every type (Lecturer, Assistant Professor, Professor)
        //because of inheritance
        //ArrayList and not array because the # of employees is unknown
        ArrayList <Employee> empList = new ArrayList<Employee>();

        //ActionListener for the clear button - ensures the form is cleared
        //when the clear button is pressed
        clear.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lastNameText.setText("");
				firstNameText.setText("");
				addressText.setText("");
				idText.setText("");
				summerCourseTitleText.setText("");
				salaryText.setText("");
                grantText.setText("");
			}
		});

        //ActionListener for the submit button - creates respective
        //Employee object and stores it in the ArrayList
        submit.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //Default variables that apply to every type of employee
                String lastName = lastNameText.getText();
                String firstName = firstNameText.getText();
                String address = addressText.getText();
                int id = Integer.valueOf(idText.getText());
                int salary = Integer.valueOf(salaryText.getText());

                if(employeePickBox.getSelectedItem().equals("Lecturer"))
                {
                    Employee employee = new Employee();
                    employee.last_name = lastName;
                    employee.first_name = firstName;
                    employee.address = address;
                    employee.id = id;
                    employee.monthly_salary = salary;
                    empList.add(employee);

                }
                if(employeePickBox.getSelectedItem().equals("Assistant Professor"))
                {
                    AssistantProfessor ap = new AssistantProfessor();
                    ap.last_name = lastName;
                    ap.first_name = firstName;
                    ap.address = address;
                    ap.id = id;
                    ap.monthly_salary = salary;
                    if(teachingSummer.getSelectedItem().equals("Yes"))
                    {
                        ap.additionalPayment(true);
                        ap.extraCourseTitle = summerCourseTitleText.getText();
                    }
                    empList.add(ap);

                }
                if(employeePickBox.getSelectedItem().equals("Professor"))
                {
                    Professor prof = new Professor();
                    prof.last_name = lastName;
                    prof.first_name = firstName;
                    prof.address = address;
                    prof.id = id;
                    prof.monthly_salary = salary;
                    if(teachingSummer.getSelectedItem().equals("Yes"))
                    {
                        prof.additionalPayment(true);
                        prof.extraCourseTitle = summerCourseTitleText.getText();
                    }
                    if(receiveGrant.getSelectedItem().equals("Yes"))
                    {
                        prof.bonus(true);
                    }

                    empList.add(prof);

                }

                //clears form after submission to make it easier to input
                //info for multiple employees
                lastNameText.setText("");
				firstNameText.setText("");
				addressText.setText("");
				idText.setText("");
				summerCourseTitleText.setText("");
				salaryText.setText("");
                grantText.setText("");
            }
        });

        //ActionListener for the done button - pushes the first name of every
        //employee into an array for easy selection by the user when button is clicked
        done.addActionListener((ActionListener) new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String empListArr[] = new String[empList.size()];
                for(int i = 0; i <empListArr.length; i++)
                {
                    empListArr[i] = empList.get(i).first_name;
                }
                doneFrame = new JFrame();
                doneFrame.setSize(200, 200);
                doneFrame.setLayout(gbl);
                doneFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                doneFrame.setVisible(true);
                employeeList = new JComboBox(empListArr);
                doneFrame.add(employeeList);
                

                go = new JButton("Go");
                doneFrame.add(go);

                //ActionListener for the go button - retrieves the info
                //for the employee selected by the user when the button is clicked
                go.addActionListener((ActionListener) new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent f){
                        resultFrame = new JFrame("Employee Information");
                        resultFrame.setSize(500, 500);
                        resultFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        resultFrame.setVisible(true);
                        results = new JTextArea(empList.get(findIndex(empListArr, employeeList.getSelectedItem().toString())).toString());
                        resultFrame.add(results);

                    }
                });
            }
        });



    }

    //runs the interface
    public static void main(String[] args) {
        PaymentSystemInterface ABCPayment = new PaymentSystemInterface();
    }
}
