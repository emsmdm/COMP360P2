import java.util.*;
import javax.swing.*;
import java.awt.*;

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
        SystemFrame.setSize(350, 400);
        gbl = new GridBagLayout();
		gbc = new GridBagConstraints();
		SystemFrame.setLayout(gbl);
		SystemFrame.setVisible(true);
    }

    public static void main(String[] args) {
        PaymentSystemInterface ABCPayment = new PaymentSystemInterface();
    }
}
