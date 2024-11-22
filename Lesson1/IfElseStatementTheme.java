package Lesson1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMaleGender = false;
        if (!isMaleGender) {
            System.out.println("Male gender");
        } else {
            System.out.println("Female gender");
        }
        int age = 18;
        if (age > 18) {
            System.out.println("He(she) is adult");
        } else {
            System.out.println("He(she) is child");
        }
        float height = 1.0f;
        if (height < 1.8) {
            System.out.println("Height is less than 1.8");
        } else {
            System.out.println("Height is greater than 1.8");
        }
        String name = "Andrey";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("His name is Misha.");
        } else if (firstLetterOfName == 'I') {
            System.out.println("His name is Igor.");
        } else {
            System.out.println("Everything will be fine! ");
        }

        System.out.println("\n2. Поиск большего числа");
        int first = 7;
        int second = 9;
        if (first < second) {
            System.out.println("Second is greater than first");
        } else if (first > second) {
            System.out.println("First is greater than second");
        } else {
            System.out.println("First and second are equal");
        }

        System.out.println("\n3. Проверка числа");
        int number = 7;
        if (number == 0) {
            System.out.println("Number is zero");
        } else {
            if (number < 0) {
                System.out.println(number + "Number is negative");
            } else {
                System.out.println(number);
            }
            if (number % 2 == 0) {
                System.out.println(number + " - Number is even");
            } else {
                System.out.println(number + " - Number is odd");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        System.out.println("Исходные числа : " + number1 + " и " + number2);
        if (number1 % 10 != number2 % 10 && number1 / 10 % 10 != number2 / 10 % 10 &&
                number1 / 100 % 10 != number2 / 100 % 10) {
            System.out.println("Числа  не равны. Цифры и разряды не равны!!!");
        } else {
            if (number1 % 10 == number2 % 10) {
                System.out.print("Разряды под номером три - равны.   " + number1 % 10 + " = " + number2 % 10);
            }
            if (number1 / 10 % 10 == number2 / 10 % 10) {
                System.out.print("  Разряды под номером два - равны.   " + number1 / 10 % 10 + " = " +
                        number2 / 10 % 10);
            }
            if (number1 / 100 % 10 == number2 / 100 % 10) {
                System.out.print("  Разряды под номером один - равны.   " + number1 / 100 % 10 + " = " +
                        number2 / 100 % 10);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char code = '\u0057';
        if (Character.isUpperCase(code)) {
            System.out.println("This is the letter in uppercase:  " + "\'" + code + "\'");
        } else if (Character.isLowerCase(code)) {
            System.out.println("This is the letter in lowercase  " + "\'" + code + "\'");
        } else if (!Character.isLetterOrDigit(code)) {
            System.out.println("This is number  " + "\'" + code + "\'");
        } else {
            System.out.println("Neither is a letter nor a number  " + "\'" + code + "\'");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        float amountOfMoney = 321123.59f;
        float interestRate = 0.0f;
        if (amountOfMoney < 100000f) {
            interestRate = (float) 5 / 12;
        } else if (amountOfMoney >= 100000f && amountOfMoney <= 300000f) {
            interestRate = (float) 7 / 12;
        } else if (amountOfMoney > 300000f) {
            interestRate = (float) 10 / 12;
        }
        float firstMonth = (amountOfMoney / (float) 100) * interestRate + amountOfMoney;
        float secondMonth = (firstMonth / (float) 100) * interestRate + amountOfMoney;
        float thirdMonth = (secondMonth / (float) 100) * interestRate + amountOfMoney;
        float fourthMonth = (thirdMonth / (float) 100) * interestRate + amountOfMoney;
        float fifthMonth = (fourthMonth / (float) 100) * interestRate + amountOfMoney;
        float sixthMonth = (fifthMonth / (float) 100) * interestRate + amountOfMoney;
        float seventhMonth = (sixthMonth / (float) 100) * interestRate + amountOfMoney;
        float eighthMonth = (seventhMonth / (float) 100) * interestRate + amountOfMoney;
        float ninthMonth = (eighthMonth / (float) 100) * interestRate + amountOfMoney;
        float tenthMonth = (ninthMonth / (float) 100) * interestRate + amountOfMoney;
        float eleventhMonth = (tenthMonth / (float) 100) * interestRate + amountOfMoney;
        float twelfthMonth = (eleventhMonth / (float) 100) * interestRate + amountOfMoney;
        System.out.println("Сумма вклада = " + amountOfMoney + "\nСумма начисленного процента = " +
                (twelfthMonth - amountOfMoney) + "\nИтоговая сумма с % = " + twelfthMonth);

        System.out.println("\n7. Определение оценки по предметам");
        int percentsHistory = 59;
        int gradeHistory = 2;
        if (percentsHistory > 60) {
            gradeHistory = 3;
        } else if (percentsHistory > 73) {
            gradeHistory = 4;
        } else if (percentsHistory > 91) {
            gradeHistory = 5;
        }
        int percentsProgramming = 92;
        int gradeProgramming = 5;
        if (percentsProgramming <= 60) {
            gradeProgramming = 2;
        } else if (percentsProgramming > 60) {
            gradeProgramming = 3;
        } else if (percentsProgramming > 73) {
            gradeProgramming = 4;
        }
        float averageGrade = (float) (gradeProgramming + gradeHistory) / 2;
        float averagePercent = (float) (percentsHistory + percentsProgramming) / 2;
        System.out.println("History: " + gradeHistory + "\n" + "Programming: " + gradeProgramming + "\n" +
                "Average grade: " + averageGrade + "\n" + "Average percent: " + averagePercent);

        System.out.println("\n8. Расчет годовой прибыли");
        float goodsAreSoldMonthly = 13025.233f;
        float premisesRentalMonthly = 5123.018f;
        float productionCostMonthly = 9001.729f;
        float profitForTheYear = (goodsAreSoldMonthly - (premisesRentalMonthly + productionCostMonthly)) * 12;
        if (profitForTheYear > 0) {
            System.out.println("Profit for the year is:  " + "+" + profitForTheYear);
        } else {
            System.out.println("Profit for the year is:  " + profitForTheYear);
        }

        System.out.println("\n10. Подсчет начисленных банком %");
        BigDecimal moneyOfAmount = new BigDecimal("321123.59");
        BigDecimal intRate = null;
        if (moneyOfAmount.floatValue() < 100000f) {
            BigDecimal intRate1 = new BigDecimal("5").divide(BigDecimal.valueOf(12), 3, RoundingMode.HALF_UP);
            intRate = intRate1;
        } else if (moneyOfAmount.floatValue() >= 100000f && moneyOfAmount.floatValue() <= 300000f) {
            BigDecimal intRate2 = new BigDecimal("7").divide(BigDecimal.valueOf(12), RoundingMode.HALF_UP);
            intRate = intRate2;
        } else if (moneyOfAmount.floatValue() > 300000f) {
            BigDecimal intRate3 = new BigDecimal("10").divide(BigDecimal.valueOf(12), RoundingMode.HALF_UP);
            intRate = intRate3;
        }
        BigDecimal fMonth = (moneyOfAmount.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal sMonth = (fMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal tMonth = (sMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal foMonth = (tMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal iMonth = (foMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal siMonth = (iMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal seMonth = (siMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal eiMonth = (seMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal niMonth = (eiMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal teMonth = (niMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal elMonth = (teMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        BigDecimal twMonth = (elMonth.divide(new BigDecimal("100"), 3)).multiply(intRate).
                add(moneyOfAmount);
        System.out.println("Сумма вклада = " + moneyOfAmount + "\nСумма начисленного процента = " +
                twMonth.subtract(moneyOfAmount).setScale(3, RoundingMode.HALF_UP) +
                "\nИтоговая сумма с % = " + twMonth.setScale(3, RoundingMode.HALF_UP));

    }
}
