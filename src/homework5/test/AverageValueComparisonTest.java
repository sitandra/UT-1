import homework5.main.AverageValueComparison;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class AverageValueComparisonTest {

    @Test
    @DisplayName("Проверка расчета среднего значения в списке")
    public void checkCalcAverageValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = AverageValueComparison.class.getDeclaredMethod("calcAverage", List.class);
        method.setAccessible(true);
        double epsilon = 0.000001d;

        List<Integer> testList = new ArrayList<>();
        testList.add(0);
        testList.add(1);
        testList.add(1);

        double returnValue = (double) method.invoke(AverageValueComparison.class, testList);
        assertEquals(returnValue, 0.666667, epsilon);

        testList.add(1);
        returnValue = (double) method.invoke(AverageValueComparison.class, testList);
        assertEquals(returnValue, 0.75, epsilon);

        testList.add(2);
        returnValue = (double) method.invoke(AverageValueComparison.class, testList);
        assertEquals(returnValue, 1, epsilon);

        testList.add(-2);
        returnValue = (double) method.invoke(AverageValueComparison.class, testList);
        assertEquals(returnValue, 0.5, epsilon);
    }

    @Test
    @DisplayName("Проверка при огромных значениях")
    public void checkCalcAverageValueWithMaxValues() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = AverageValueComparison.class.getDeclaredMethod("calcAverage", List.class);
        method.setAccessible(true);
        double epsilon = 0.000001d;

        List<Integer> testList = new ArrayList<>();
        for (int i = 0; i < 99999; i++) {
            testList.add(Integer.MAX_VALUE);
        }

        double returnValue = (double) method.invoke(AverageValueComparison.class, testList);
        assertEquals(returnValue, Integer.MAX_VALUE, epsilon);
    }

    @Test
    @DisplayName("Проверка результата")
    public void checkCorrectCompare() {
        List<Integer> testList1 = new ArrayList<>();
        testList1.add(0);
        testList1.add(1);
        testList1.add(2);

        List<Integer> testList2 = new ArrayList<>();
        testList2.add(0);
        testList2.add(1);

        AverageValueComparison avc = new AverageValueComparison(testList1, testList2);
        assertEquals(avc.getResult(), "Первый список имеет большее среднее значение");

        testList2.add(2);
        avc = new AverageValueComparison(testList1, testList2);
        assertEquals(avc.getResult(), "Средние значения равны");

        testList2.add(100);
        avc = new AverageValueComparison(testList1, testList2);
        assertEquals(avc.getResult(), "Второй список имеет большее среднее значение");
    }
}
