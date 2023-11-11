import java.util.*;

public class Employee {
    protected String first_name;
    protected String last_name;
    protected String address;
    protected int id;
    protected int monthly_salary;

    protected int nineMonthPayment()
    {
        return monthly_salary * 9;
    }

    public String toString()
    {
        String response = String.format("First and last name: %s %s\nAddress: %s\nEmployee ID: %d\n9 month salary: %d", first_name, last_name, address, id, nineMonthPayment());
        return response;
    }
}