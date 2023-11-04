import java.util.*;

public class AssistantProfessor {
    protected String extraCourse;
    protected int summerPay

    protected int additionalPayment(){
        summerPay = monthly_salary * 1.5;
        return summerPay;
    }

    public string summerPayment(){
        String extraPay = String.format("Summer Payment: %s", additionalPayment());
        return extraPay;
    }

}