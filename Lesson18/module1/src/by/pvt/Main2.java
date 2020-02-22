package by.pvt;

import java.text.DateFormat;

import java.text.ParseException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Main2 {
    public static void main(String[] args) {



        System.out.println(
                DateFormat.getTimeInstance(DateFormat.FULL, new Locale("be", "BY"))
                .format(new Date())
        );
        System.out.println(
                DateFormat.getTimeInstance(DateFormat.LONG, new Locale("ru", "RU"))
                .format(new Date())
        );
        System.out.println(
                DateFormat.getTimeInstance(DateFormat.LONG, new Locale("en", "US"))
                        .format(new Date())
        );

        System.out.println(
                DateFormat.getDateInstance(DateFormat.FULL, new Locale("be", "BY"))
                        .format(new Date())
        );
        System.out.println(
                DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"))
                        .format(new Date())
        );
        System.out.println(
                DateFormat.getDateInstance(DateFormat.SHORT, new Locale("en", "US"))
                        .format(new Date())
        );

        System.out.println(
                DateFormat.getDateTimeInstance(
                        DateFormat.FULL, DateFormat.FULL,
                        new Locale("be", "BY"))
                        .format(new Date())
        );
        System.out.println(
                DateFormat.getDateTimeInstance(
                        DateFormat.LONG, DateFormat.LONG,
                        new Locale("ru", "RU"))
                        .format(new Date())
        );
        System.out.println(
                DateFormat.getDateTimeInstance(
                        DateFormat.MEDIUM, DateFormat.MEDIUM,
                        new Locale("en", "US"))
                        .format(new Date())
        );

        try {
            Date date =
            DateFormat.getDateInstance(DateFormat.SHORT,new Locale("ru", "RU"))
                    .parse("24.05.2019");
            System.out.println(date);
            Date date2 =
                    DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,new Locale("ru", "RU"))
                            .parse("24.05.2019, 12:30");
            System.out.println(date.getTime());
            System.out.println(date2.getTime());
            System.out.println(date2);


            Date date3 =new Date(0L);
            System.out.println(date3);

            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
            calendar.setTimeInMillis(0L);
            System.out.println(calendar);
            Date date4 = calendar.getTime();
            System.out.println(date4);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd MM YYY HH:mm")));
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd-MMM-uuuu")));


    }
}
