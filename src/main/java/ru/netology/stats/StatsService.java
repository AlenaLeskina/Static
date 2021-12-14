package ru.netology.stats;

import java.util.Arrays;

public class StatsService {

    public int sumSales(int[] month) {
        return Arrays.stream(month).sum();
    }

    public double avrgSales(int[] month) {
        double sum = 0;
        for (int x : month) {
            sum += x;
        }
        return sum / month.length;
    }

    public int maxSales(int[] month) {
        int max = month[0];
        int maxMonth = 0;
        for (int i = 1; i < month.length; i++) {
            if (max <= month[i]) {
                max = month[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] month) {
        int min = month[0];
        int minMonth = 0;
        for (int i = 1; i < month.length; i++) {
            if (min >= month[i]) {
                min = month[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underSales(int[] month) {
        int counter = 0;
        for (int j : month) {
            if (j < avrgSales(month)) {
                counter++;
            }
        }
        return counter;
    }

    public int upperSales(int[] month) {
        int counter = 0;
        for (int j : month) {
            if (j > avrgSales(month)) {
                counter++;
            }
        }
        return counter;
    }
}




