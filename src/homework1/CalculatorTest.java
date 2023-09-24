package homework1;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        //assert 6 == calc.calculateDiscount(5, 5);
        assertThat(Calculator.calculateDiscount(100, 5)).isEqualTo(95);
        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThatThrownBy( () -> Calculator.calculateDiscount(100, 101)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(100, -1)
        ).isInstanceOf(ArithmeticException.class);
    }
}
