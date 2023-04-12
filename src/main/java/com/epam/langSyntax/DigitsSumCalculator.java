package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int result = 0;
        int currentDigit;
        while (number > 0) {
            currentDigit = number % 10;
            result += currentDigit;
            number = number / 10;
        }
        System.out.println(result);
    }

}
