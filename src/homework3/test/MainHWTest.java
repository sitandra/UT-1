import homework3.main.MainHW;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {
    @ParameterizedTest
    @DisplayName("Проверка четности числа")
    @ValueSource(ints = {-2, 0, 10})
    public void numberIsEven(int n) {
        assertTrue(MainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @DisplayName("Проверка нечетности числа")
    @ValueSource(ints = {-1, 3})
    public void numberIsOdd(int n) {
        assertFalse(MainHW.evenOddNumber(n));
    }

    @ParameterizedTest
    @DisplayName("Число попадает в интервал от 25 до 100")
    @ValueSource(ints = {26, 50, 99})
    public void numberInRange25To100(int n) {
        assertTrue(MainHW.numberInInterval(n));
    }

    @ParameterizedTest
    @DisplayName("Число не попадает в интервал от 25 до 100")
    @ValueSource(ints = {0, 25, 100})
    public void numberNotInRange25To100(int n) {
        assertFalse(MainHW.numberInInterval(n));
    }
}
