package local.kyungmin_wms.formatter;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Locale;
import org.springframework.format.Formatter;

public class LocalDateTimeFormatter implements Formatter<LocalDateTime> {

  @Override
  public LocalDateTime parse(String text, Locale locale) throws ParseException {
    String[] split = text.split("-:");
    return LocalDateTime.of(Integer.parseInt(split[0]) , Integer.parseInt(split[1]) , Integer.parseInt(split[2]) , Integer.parseInt(split[3]) , Integer.parseInt(split[4]) , Integer.parseInt(split[5]));
  }

  @Override
  public String print(LocalDateTime localDateTime, Locale locale) {
    int year = localDateTime.getYear();
    int month = localDateTime.getMonthValue();
    int day = localDateTime.getDayOfMonth();
    int hour = localDateTime.getHour();
    int minute = localDateTime.getMinute();
    int second = localDateTime.getSecond();
    return String.format("%d-%d-%d %d:%d:%d " , year , month , day , hour , minute , second);
  }
}
