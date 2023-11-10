import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.desktop.SystemSleepEvent;

public class PaymentSystemInterface {
    public JFrame SystemFrame;
    public JFrame doneFrame;
    public JFrame resultFrame;
    public JPanel input;
    public JPanel output;
    public JLabel selectTeacher;
    public JButton submit;
    public JButton done;
    public JButton go;
    public JTextField name;
    public JTextField address;
    public JTextField id;
    public JTextField summerCourseTitle;
    public JComboBox employeePick;
    public JComboBox grantOverMil;
    public JComboBox employeeList;
    GridBagLayout gbl;
    GridBagConstraints gbc;
    GridBagConstraints gb

    public PaymentSystemInterface() {
        SystemFrame = new JFrame("ABC University Payment System");
        SystemFrame.setSize(600, 600);
        SystemFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		SystemFrame.setLayout(gbl);
		SystemFrame.setVisible(true);

        input = new JPanel();
		input.setLayout(gbl);
		output = new JPanel();
		output.setLayout(gbl);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(3, 3, 3, 3);

        gbc.gridx = 0;
		gbc.gridy = 0;
		SystemFrame.add(input, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.ipady = 40;
		SystemFrame.add(output, gbc);

        Color fieldColor = new Color(91, 200, 95);
        name = new JTextField(5);
        name.setBackground(fieldColor);




        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 6;
        gbc.ipady = 0;
        input.add(name, gbc);

        done = new JButton("Done");
        gbc.gridx = 0;
        gbc.gridy = 2;
        SystemFrame.add(done, gbc);

        done.addActionListener(new ActionListener(){
            public void ActionPerformed(ActionEvent e){
                doneFrame = new JFrame();
                doneFrame.setSize(200, 200);
                doneFrame.setLayout(gbl);
                doneFrame.setVisible(true);

                String[] empList = {};
                employeeList = new JComboBox(empList);
                doneFrame.add(employeeList);

                go = new JButton("Go");
                doneFrame.add(go);

                go.addActionListener(new ActionListener(){
                    public void ActionDone(ActionEvent f){
                        resultFrame = new JFrame("Employee Information");
                        resultFrame.setSize(500, 500);
                        resultFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    }
                })
            }
        });



    }

    public static void main(String[] args) {
        PaymentSystemInterface ABCPayment = new PaymentSystemInterface();
    }
}
