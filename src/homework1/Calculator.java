package homework1;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0 || discountAmount > 99)
            throw new ArithmeticException("Недопустимый размер скидки");
        return purchaseAmount - purchaseAmount * ((double) discountAmount / 100);
    }
}
