package com.startup.business;

public class Rules {
    final private static int baseIncomeSlab = 500_000;
    final private static int secondIncomeSlab = 700_000;
    final private static int thirdIncomeSlab = 1_000_000;

    public static int taxRate(int income) {
        return switch (income) {
            case baseIncomeSlab -> 10;
            default -> throw new IllegalStateException("Unexpected value: " + income);
        };
    }
}
