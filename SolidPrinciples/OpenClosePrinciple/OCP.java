package SolidPrinciples.OpenClosePrinciple;

// Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.
// Example without OCP
class DiscountCalculater1 {

    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.10;
        } else if (customerType.equals("premium")) {
            return amount * 0.20;
        } else {
            return 0;
        }
    }
}
// This violates OCP because the class is not closed for modification.

// Apply OCP
//step1: create an interface for discount stratgy!
interface DiscountStartegy {

    double applyDiscount(double amount);
}
// step 2: Implement different discount strategies!

class RegularCustomerDiscount implements DiscountStartegy {

    public double applyDiscount(double amount) {
        return amount * 0.10; //10% discount
    }
}

class PremiumCustomerDiscount implements DiscountStartegy {

    public double applyDiscount(double amount) {
        return amount * 0.20;
    }
}

// step 3: Modify DiscountCalculator to use Discount Strategy
class DiscountCalculator {

    public double calculateDiscount(DiscountStartegy startegy, double amount) {
        return startegy.applyDiscount(amount);
    }
}

public class OCP {

    public static void main(String[] args) {
        System.out.println("Open Close Principle");

        DiscountCalculator calculator = new DiscountCalculator();

        // Regular Customer Discount
        DiscountStartegy regularDiscount = new RegularCustomerDiscount();

        System.out.println("Regular Discount: " + calculator.calculateDiscount(regularDiscount, 1000));

        DiscountStartegy premiumDiscount = new PremiumCustomerDiscount();
        System.out.println("Premium Discount: " + calculator.calculateDiscount(premiumDiscount, 1000));

    }

}
