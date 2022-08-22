import org.example.CalculatorCredit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreditCalcul {

    CalculatorCredit credit = new CalculatorCredit();
    @Test
    public void mounhtPayment(){
   int cash= 12000 ,mounth= 12 ;
    int subresult =cash/mounth;
        assertEquals(1000,subresult);
    }
    @Test
    public void totalAmouth(){
        double procentofCredit = 3;
        int amouthCredit = 100;
        double valueOfCredit =  ((amouthCredit*procentofCredit)/100);
        double result = amouthCredit+valueOfCredit;
        assertEquals(103 ,result);
    }

    @Test
    public void overpaymentsForTheEntirePeriod(){
        double procentofCredit = 3;
        int amouthCredit = 100;
        double valueOfCredit =  ((amouthCredit*procentofCredit)/100)+amouthCredit;
        double result = valueOfCredit-amouthCredit;
        assertEquals(3,result);
    }
}
