import homework1.main.Calculator;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    public static void main(String[] args) {
        //assert 6 == calc.calculateDiscount(5, 5);

        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThatThrownBy( () -> Calculator.calculateDiscount(100, 101)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy( () -> Calculator.calculateDiscount(100, -1)
        ).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void calculateCostAfterDiscount() {
        assertThat(Calculator.calculateDiscount(100, 5)).isEqualTo(95);
    }
}
