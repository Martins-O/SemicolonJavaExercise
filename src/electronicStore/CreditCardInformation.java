package electronicStore;

import java.security.SecureRandom;
import java.time.Month;
import java.time.Year;

public class CreditCardInformation {
    private String cvv;
    private Month expirationYear;
    private Year expirationMonth;
    private String creditCardNumber;
    private String cardName;
    private CardType Type;

    private String generateCvv(){
        SecureRandom random = new SecureRandom();
        int cvv = random.nextInt();
        cvv = Math.abs(cvv % 1000);
        return String.format("%3d", cvv);
    }

    public String getCvv() {
        this.cvv = generateCvv();
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = generateCvv();
    }

    public Month getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Month expirationYear) {
        this.expirationYear = expirationYear;
    }

    public Year getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Year expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public CardType getType() {
        return Type;
    }

    public void setType(CardType type) {
        Type = type;
    }

    public static void main(String[] args) {
        CreditCardInformation credit = new CreditCardInformation();
        System.out.println(credit.getCvv());
        System.out.println(credit.getCvv());
        System.out.println(credit.getCvv());
        System.out.println(credit.getCvv());
        System.out.println(credit.getCvv());
    }

}
