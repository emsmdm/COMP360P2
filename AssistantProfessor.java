import java.util.*;

public class AssistantProfessor extends Employee {
    protected String extraCourse;
    protected double summerPay;

    protected double additionalPayment(){
        summerPay = monthly_salary * 1.5;
        return summerPay;
    }

    public String summerPayment(){
        String extraPay = String.format("Summer Payment: %s", additionalPayment());
        return extraPay;
    }

}