import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class TimeConversion {
    public static void main(String[] args) throws ParseException {
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("04:59:59AM"));

    }

    public static String timeConversion(String s) throws ParseException {
        String convertedTime = "";
        Map<String, String> times = new HashMap<>();
        times.put("01", "13");
        times.put("02", "14");
        times.put("03", "15");
        times.put("04", "16");
        times.put("05", "17");
        times.put("06", "18");
        times.put("07", "19");
        times.put("08", "20");
        times.put("09", "21");
        times.put("10", "22");
        times.put("11", "23");
        times.put("12", "00");

        String[] fragmentedHour = s.split(":");
        String restOfTime = "";

        for (Map.Entry<String, String> entry : times.entrySet()) {
            String timeIn12Hours = entry.getKey();
            String timeIn24Hours = entry.getValue();
            
            if (fragmentedHour[0].equals(timeIn12Hours)) {
                restOfTime = s.substring(2, 8);
                convertedTime = timeIn24Hours;
            }
        }

        return convertedTime.concat(restOfTime);
    }

}
