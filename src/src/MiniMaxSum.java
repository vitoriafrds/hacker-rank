import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(List.of(1, 3, 5, 7, 9));
    }

    public static void miniMaxSum(List<Integer> arr) {
        int minimumSum = 0;
        int maximumSum = 0;
        List<Integer> values = new ArrayList<>(List.copyOf(arr));

        int biggest = arr.stream().max(Comparator.naturalOrder()).get();
        int smaller = arr.stream().min(Comparator.naturalOrder()).get();

        values.remove(values.indexOf(biggest));
        for (int i=0; i < values.size(); i++) {
            minimumSum = minimumSum + values.get(i);
        }

        values.add(biggest);
        values.remove(values.indexOf(smaller));
        for (int i=0; i < values.size(); i++) {
            maximumSum = maximumSum + values.get(i);
        }

        System.out.println(minimumSum + " " + maximumSum);
    }
}
