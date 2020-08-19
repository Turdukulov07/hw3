package com.company;

public class Main {

    public static void main(String[] args) {
        double[] nums = {3, 12.2, 12.9, -1, 21, 32, 1.32};
        double kol = 0;
        double sum = 0;
        boolean isOtr = false;
        for (double num : nums) {
            if (num < 0) {
                isOtr = true;
            } else {
                if (isOtr == true) {
                    kol++;
                    sum = sum + num;
                }
            }
        }
        System.out.println("Ваше ср. ариф число: " + sum / kol);
    }
}
