import java.util.*;

public class Professor extends AssistantProfessor{
    protected int grant = 0;
    protected int totalBonus = 0;
    protected boolean grantExist = false;

    protected int bonus(boolean recieveGrant){
        if(recieveGrant){
            grantExist = true;
            if(grant > 1000000){
                return 7000;
            }
        }
        return 0;
    }

    public String toString(){
        String bonusPay = String.format(super.toString() + "\nGrant Amount: %d\nTotal bonus payment (Grant + Grant bonus + Summer payment): %d", grant, bonus(grantExist) + grant + summerPay);
        return bonusPay;
    }
}

