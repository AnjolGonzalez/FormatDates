package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.now();

        DateTimeFormatter date = DateTimeFormatter.ofPattern("MM/dd/yyy");
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        DateTimeFormatter date3 = DateTimeFormatter.ofPattern("E, MMMM dd yyyy HH:mm");
        DateTimeFormatter date4 = DateTimeFormatter.ofPattern("HH:mm dd-MMM-yyyy");

        String formatDate = localDate.format(date);
        String formatDate1 = localDate.format(date1);
        String formatDate2 = localDate.format(date2);
        String formatDate3 = localDate.format(date3);
        String[] formatDate4 = localDate.format(date4).split("\\ ");

        System.out.println(formatDate +"\n"+
                formatDate1 + "\n" +
                formatDate2 + "\n" +
                formatDate3 + "\n" +
                formatDate4[0] + " on " + formatDate4[1]);

    }
}
