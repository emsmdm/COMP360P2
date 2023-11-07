import java.util.*;

public class Professor extends AssistantProfessor{
    protected int grant = 0;
    protected int totalBonus = 0;
    protected boolean grantExist = false;

    protected int grantAmount(boolean recieveGrant){
        if(recieveGrant){
            grantExist = true;
            if(grant > 1000000){
                totalBonus = summerPay + 7000;
            }
        }
        return totalBonus
    }

    public String toString(){
        String bonusPay = String.format(super.toString() + "\nTotal Bonus Payment: %s", grantAmount(grantExist));
        return bonusPay;
    }
}