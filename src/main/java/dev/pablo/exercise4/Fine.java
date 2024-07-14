package dev.pablo.exercise4;

import java.time.LocalDateTime;

public class Fine {
    private double amount;
    private LocalDateTime dateTime;

    public Fine(double amount) {
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
