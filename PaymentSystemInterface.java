import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.desktop.SystemSleepEvent;

public class PaymentSystemInterface {
    public JFrame SystemFrame;
    public JPanel input;
    public JPanel output;
    public JButton submit;
    public JTextField name;
    public JTextField address;
    public JTextField id;
    public JTextField summerCourseTitle;
    public JComboBox employeePick;
    public JComboBox grantOverMil;
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

    }

    public static void main(String[] args) {
        PaymentSystemInterface ABCPayment = new PaymentSystemInterface();
    }
}
