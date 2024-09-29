package local.kyungmin_wms.formatter;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import org.springframework.format.Formatter;

public class LocalDateTimeFormatter implements Formatter<LocalDateTime> {

  @Override
  public LocalDateTime parse(String text, Locale locale) throws ParseException {
    /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MM. dd. a hh:mm");
    return LocalDateTime.parse(text , formatter);*/
    String[] split = text.split("-: ");
    return LocalDateTime.of(Integer.parseInt(split[0]) , Integer.parseInt(split[1]) , Integer.parseInt(split[2]) , 0 , 0);
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
