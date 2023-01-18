package chapter4;

import java.math.BigDecimal;

public class TaxCalculator {

   private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
   private static final  double BASE_TAX_RATE = 0.15;
   private static final  double ADDITION_TAX_RATE = 0.20;

   public static BigDecimal calcalateTax(Citizen citizen){
      BigDecimal taxAmount = BigDecimal.ZERO;
      if (citizen.getEarnings().compareTo(MINIMUM_EARNING)  > 0) {
         taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
      }
      else {
         BigDecimal tax = MINIMUM_EARNING.multiply(BigDecimal.valueOf(BASE_TAX_RATE));
         BigDecimal remain = citizen.getEarnings().subtract(MINIMUM_EARNING).multiply(BigDecimal.valueOf(ADDITION_TAX_RATE));
         taxAmount = tax.add(remain);
      }
      return taxAmount;
   }
}
