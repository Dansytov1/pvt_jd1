package by.pvt;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("be","BY"));

        Locale localeBy = new Locale("be", "BY");
        Locale localeRu = new Locale("ru", "RU");

        System.out.println(localeBy);
        System.out.println(localeRu);
        System.out.println(Locale.US);
        System.out.println(Locale.getDefault());
        System.out.println(Arrays.toString(Locale.getAvailableLocales()));
        Locale locale = new Locale("os","RU");
        System.out.println(locale.getDisplayLanguage());
        System.out.println(localeBy.getDisplayLanguage());
        NumberFormat numberFormatBy = NumberFormat.getNumberInstance(localeBy);
        NumberFormat numberFormatRu = NumberFormat.getNumberInstance(localeRu);
        NumberFormat numberFormatUs = NumberFormat.getNumberInstance(Locale.US);

        System.out.println(numberFormatBy.format(12345.457));
        System.out.println(numberFormatRu.format(12345.457));
        System.out.println(numberFormatUs.format(12345.457));

        NumberFormat currFormatBy = NumberFormat.getCurrencyInstance(localeBy);
        NumberFormat currFormatRu = NumberFormat.getCurrencyInstance(localeRu);
        NumberFormat currFormatUs = NumberFormat.getCurrencyInstance(Locale.US);



        System.out.println(currFormatBy.format(1234567.123));
        System.out.println(currFormatRu.format(1234567.123));
        System.out.println(currFormatUs.format(1234567.123));



    }
}
