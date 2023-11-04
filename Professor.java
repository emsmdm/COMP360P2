import java.util.*;

public class Professor extends AssistantProfessor{
    protected int grant;
    protected int bonus;

    protected int grantAmount(int grantMoney){
        grant = grantMoney;
    }

    protected int bonusMoney(){
        if(grant > 1000000){
            bonus += 7000;
        }
    }

    public string bonusPayment(){
        String bonusPay = String.format("Total Bonus Payment: %s", bonus);
        return bonusPay;
    }
}