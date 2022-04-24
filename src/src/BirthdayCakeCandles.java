import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(List.of(4, 4, 1, 3)));
        System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int totalHeightCandles = 0;

        Integer tallestCandle = candles.stream().max(Comparator.naturalOrder()).get();

        for (int i=0; i<candles.size(); i++) {
            if (candles.get(i).equals(tallestCandle)) {
                totalHeightCandles = totalHeightCandles + 1;
            }
        }

        return totalHeightCandles;
    }
}
