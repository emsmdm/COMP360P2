import java.util.*;

public class AssistantProfessor extends Employee {
    protected String extraCourseTitle = "N/A";
    protected double summerPay = 0.0;
    protected boolean summerCourse = false;

    protected double additionalPayment(boolean isTeachingSummerClass){
        if(isTeachingSummerClass)
        {
            summerPay = monthly_salary * 1.5;
            summerCourse = true;
        }
        return summerPay;
    }


    public String toString()
    {
        String extraPay = String.format(super.toString() + "\nSummer Payment: %.2f\nSummer Course: %s", additionalPayment(summerCourse), extraCourseTitle);
        return extraPay;
    }

}