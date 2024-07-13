package dev.pablo.exercise3;

public class ArmstrongChecker {
    private int number;

    public ArmstrongChecker() {
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isArmstrong() {
        if (number < 0) {
            return false;
        } 

        int numDigits = (int) Math.floor(Math.log10(number) + 1);
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        return sum == number;
    }
}
 