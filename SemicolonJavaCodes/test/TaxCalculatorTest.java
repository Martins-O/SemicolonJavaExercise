import chapter4.Citizen;
import chapter4.TaxCalculator;
import org.junit.jupiter.api.*;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorTest {
    private TaxCalculator taxCalculator;
    private Citizen mathias;
    private Citizen adewunmi;
    private Citizen deola;

    @BeforeEach
    public void setUp(){
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setSurname("Momodu");
        BigDecimal salary = new BigDecimal(17000);
        mathias.setEarnings(salary);

        adewunmi = new Citizen("Adewunmi", "Adegunwa");
        adewunmi.setEarnings(BigDecimal.valueOf(25000));

        deola = new Citizen("Adeola", "Adekunle", BigDecimal.valueOf(45000));
    }
    @Test
    public void calculateTax(){
        BigDecimal mathiasTax = TaxCalculator.calcalateTax(mathias);
        assertEquals(2550.00,mathiasTax.intValue());
        BigDecimal adewunmiTax = TaxCalculator.calcalateTax(adewunmi);
        assertEquals(3750.00,adewunmiTax.intValue());
        BigDecimal adeolaTax = TaxCalculator.calcalateTax(deola);
        assertEquals(7500.00,adeolaTax.intValue());
    }

}