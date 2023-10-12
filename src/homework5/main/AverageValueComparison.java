package homework5.main;

import java.util.List;

final public class AverageValueComparison {
    private final Double averageValue1;
    private final Double averageValue2;

    public AverageValueComparison(List<Integer> list1, List<Integer> list2) {
        this.averageValue1 = calcAverage(list1);
        this.averageValue2 = calcAverage(list2);
    }

    private static double calcAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        long sum = 0;
        for (int i: list) sum += i;
        return (double) sum / list.size();
    }

    public String getResult() {
        return switch(averageValue1.compareTo(averageValue2)) {
            case -1 -> "Второй список имеет большее среднее значение";
            case 1 -> "Первый список имеет большее среднее значение";
            default -> "Средние значения равны";
        };
    }
}
