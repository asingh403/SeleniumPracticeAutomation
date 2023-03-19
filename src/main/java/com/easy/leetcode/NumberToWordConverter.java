package com.easy.leetcode;

import java.util.Scanner;

import java.util.Scanner;

public class NumberToWordConverter {
    private static final String[] units = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen" };
    private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
        String word = convertNumberToWords(368);
        System.out.println(word);
//        scanner.close();
    }

    public static String convertNumberToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        String words = "";

        if (number / 1000 > 0) {
            words += convertHundredsToWords(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if (number / 100 > 0) {
            words += convertHundredsToWords(number / 100) + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                words += units[number];
            } else {
                words += tens[number / 10];
                if (number % 10 > 0) {
                    words += " " + units[number % 10];
                }
            }
        }

        return words;
    }

    public static String convertHundredsToWords(int number) {
        String words = "";
        if (number < 100) {
            return convertNumberToWords(number);
        }
        if (number / 100 > 0) {
            words += units[number / 100] + " Hundred ";
            number %= 100;
        }
        if (number > 0) {
            words += convertNumberToWords(number);
        }
        return words;
    }
}
