package dev.pablo.exercise3;

public class Armstrong {
    public static void main(String[] args) {
        ArmstrongChecker checker = new ArmstrongChecker();
        int[] numbersToCheck = { 371, 372, 0, 5, 153, 370, 371, 407 };

        for (int number : numbersToCheck) {
            checker.setNumber(number);
            System.out.println(number + " is Armstrong number: " + checker.isArmstrong());
        }
    }
}
