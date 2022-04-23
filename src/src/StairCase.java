public class StairCase {
    public static void main(String[] args) {
        staircase(10);
    }

    public static void staircase(int n) {
        String hashtag = "#";
        String empty = " ";
        int auxiliarCount = 1;

        while (n > 0) {
            System.out.println(empty.repeat(n - 1).concat(hashtag.repeat(auxiliarCount)));
            n = n - 1;
            auxiliarCount = auxiliarCount + 1;
        }
    }
}

