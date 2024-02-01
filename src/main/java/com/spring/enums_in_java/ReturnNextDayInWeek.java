package com.spring.enums_in_java;

/*
Create an enum named DaysOfWeek with constants representing the days of the week.
Write a method that accepts a DaysOfWeek parameter and returns the next day.
 */
public class ReturnNextDayInWeek {
    public static void main(String[] args) {
        DaysOfWeek dayOfTheWeek = DaysOfWeek.SATURDAY;
        DaysOfWeek nextDay = getNextDay(dayOfTheWeek);
        System.out.println(nextDay);
    }

    private static DaysOfWeek getNextDay(DaysOfWeek dayOfTheWeek) {
        boolean flag = false;
        for (DaysOfWeek daysOfWeek : DaysOfWeek.values()) {
            if (flag) {
                return daysOfWeek;
            }
            if (daysOfWeek == dayOfTheWeek) {
                flag = !flag;
            }
        }
        return DaysOfWeek.values()[0];
    }
}