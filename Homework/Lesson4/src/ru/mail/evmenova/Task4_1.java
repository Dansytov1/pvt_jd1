package ru.mail.evmenova;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {

        boolean isDateCorrect=false;
        int day=0;
        boolean isMonthCorrect=false;
        int month=0;
        boolean isYearCorrect=false;
        int year=0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter day: ");
            String day1 = scanner.nextLine();
            try {
                day = Integer.parseInt(day1);
                if (day>0) {
                    isDateCorrect = true;
                }
            } catch (NumberFormatException e) {

            } finally {
                if (day == 0) {
                    isDateCorrect = false;
                }
            }
        }while(!isDateCorrect);
        System.out.println("You have entered correct day: "+day);


        do {
            System.out.println("Enter month: ");
            String month1 = scanner.nextLine();
            try {
                month = Integer.parseInt(month1);
                if (month<=12&&month>0) {
                    isMonthCorrect = true;
                }
            } catch (NumberFormatException e) {

            } finally {
                if (month == 0) {
                    isMonthCorrect = false;
                }
            }
        }while (!isMonthCorrect);
                    System.out.println("You have entered correct month: "+month);



        do {
            System.out.println("Enter year: ");
            String year1 = scanner.nextLine();
            try {
                year = Integer.parseInt(year1);
                if (year>0) {
                    isYearCorrect = true;
                }
            } catch (NumberFormatException e) {

            } finally {
                if (year == 0) {
                    isYearCorrect = false;
                }
            }
        }while(!isYearCorrect);
                System.out.println("You have entered correct year: "+year);

        switch (month) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day == 31 && month == 12) {
                    year = year + 1;
                    month = 1;
                    day = 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                    if (day == 31) {
                        month = month + 1;
                        day = 1;
                        System.out.println("New date: " + day + "." + month + "." + year);
                    }

                } else {
                    day = day + 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    month = month + 1;
                    day = 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                } else {
                    day = day + 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }
                break;

            case 2:
                if (day == 29&&year%4==0&&year%100!=0||day==29&&year%400==0) {
                    month = month + 1;
                    day = 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }else if(day==28){
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                    System.out.println("New date: " + day + "." + month + "." + year);
                }
                  break;

        }
    }

}
