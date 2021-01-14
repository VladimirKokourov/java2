package ru.geekbrains.homework.lesson1;

public class DayOfWeekMain {
    public static void main(String[] args) {

        printHours(getWorkingHours(DayOfWeek.MONDAY));

    }

    public static int getWorkingHours(DayOfWeek d) {
        int hours;
        hours = d.compareTo(DayOfWeek.SATURDAY) * (-8);
        if (hours > 0) {
            return hours;
        } else {
            return 0;
        }
    }

    public static void printHours (int h){
        if(h > 0) {
            System.out.println(h);
        } else {
            System.out.println("Today is a day off!");
        }

    }

}
