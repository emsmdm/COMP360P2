import java.util.*;

public class AssistantProfessor extends Employee {
    protected String extraCourseTitle;
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
        String extraPay = String.format(super.toString() + "\nSummer Payment: %s", additionalPayment(summerCourse));
        return extraPay;
    }

    public static void main(String[] args){
        AssistantProfessor Maw = new AssistantProfessor();
        Maw.first_name = "Maw";
        Maw.last_name = "Dogbe";
        Maw.address = "5217 Emerald Spring Drive";
        Maw.id = 56789;
        Maw.monthly_salary = 52000;
        Maw.additionalPayment(true);
        Maw.extraCourseTitle = "Course 101";
        System.out.println(Maw.toString());
    
    }

}