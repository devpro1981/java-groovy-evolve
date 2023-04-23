package com.modern

import com.startup.business.Rules

class CalculateOldTax {
    static int getTaxedIncome (int userInput) {
        (Rules.taxRate(userInput) * userInput) / 100
    }
}
