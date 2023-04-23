package com.modern

class CalculateNewTax {
    final private static double baseIncomeSlab = 500_000.0
    final private static double secondIncomeSlab = 700_000.0
    final private static double thirdIncomeSlab = 1_000_000.0

    static double taxRate(double income) {
        double taxableIncome = switch (income) {
            case baseIncomeSlab -> 10
            case secondIncomeSlab -> 20
            case thirdIncomeSlab -> 30
            default -> 15
        }
        taxableIncome
    }
}
