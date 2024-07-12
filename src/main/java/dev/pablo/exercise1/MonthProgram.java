package dev.pablo.exercise1;

import java.util.Scanner;

public class MonthProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonthCalendar calendar = new MonthCalendar();

        System.out.println("Enter the month number (1-12): ");
        int monthNumber = scanner.nextInt();

        calendar.displayMonthInformation(monthNumber);

        scanner.close();
    }
}
