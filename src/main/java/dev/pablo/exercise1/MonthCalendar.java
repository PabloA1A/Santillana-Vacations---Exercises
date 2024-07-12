package dev.pablo.exercise1;

public class MonthCalendar {
    private Month[] months;

    public MonthCalendar() {
        months = new Month[12];
        months[0] = new Month(1, "January", 31);
        months[1] = new Month(2, "February", 28); 
        months[2] = new Month(3, "March", 31);
        months[3] = new Month(4, "April", 30);
        months[4] = new Month(5, "May", 31);
        months[5] = new Month(6, "June", 30);
        months[6] = new Month(7, "July", 31);
        months[7] = new Month(8, "August", 31);
        months[8] = new Month(9, "September", 30);
        months[9] = new Month(10, "October", 31);
        months[10] = new Month(11, "November", 30);
        months[11] = new Month(12, "December", 31);
    }

    public Month getMonth(int number) {
        if (number >= 1 && number <= 12) {
            return months[number - 1];
        }
        return null;
    }

    public void displayMonthInformation(int number) {
        Month month = getMonth(number);
        if (month != null) {
            System.out.println("Month: " + month.getName());
            System.out.println("Days: " + month.getDays());
        } else {
            System.out.println("Invalid month number");
        }
    }
}
