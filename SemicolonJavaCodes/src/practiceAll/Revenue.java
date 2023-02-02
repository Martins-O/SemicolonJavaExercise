package practiceAll;

import java.math.BigDecimal;

public class Revenue {
    private BigDecimal price;
    private BigDecimal quantity;

    public Revenue(){}

    public Revenue(BigDecimal price, BigDecimal quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal calculateRevenue(BigDecimal sellingPrice, BigDecimal quantitySold){
        BigDecimal revenue = sellingPrice.add(quantitySold);
        BigDecimal percentage = BigDecimal.valueOf(15/100);

        if (revenue.compareTo(BigDecimal.valueOf(5000)) < 0)
            return revenue.multiply(percentage);
        return revenue;
    }

    public static void main(String[] args) {
        Revenue revenue = new Revenue();
        revenue.setPrice(BigDecimal.valueOf(5000));
        revenue.setQuantity(BigDecimal.valueOf(1000));
        System.out.println(revenue.calculateRevenue(revenue.getPrice(), revenue.getQuantity()));
    }
}
