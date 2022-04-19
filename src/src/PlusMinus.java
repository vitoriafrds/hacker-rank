import java.util.List;
import java.util.Locale;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(List.of(1, 1, 0, -1, -1));
    }
    
    public static void plusMinus(List<Integer> arr) {
        float totalPositive = 0;
        float totalNegative = 0;
        float totalZero = 0;

        for (Integer value : arr) {
            if (value == 0) {
                totalZero =  totalZero + 1;
            }

            if (value >= 1) {
                totalPositive = totalPositive + 1;
            }

            if (value < 0) {
                totalNegative = totalNegative + 1;
            }
        }

        System.out.printf(Locale.ENGLISH, "%.6f \n", totalPositive / arr.size());
        System.out.printf(Locale.ENGLISH, "%.6f \n", totalNegative / arr.size());
        System.out.printf(Locale.ENGLISH, "%.6f \n", totalZero / arr.size());

    }
}
