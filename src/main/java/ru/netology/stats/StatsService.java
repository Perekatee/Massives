package ru.netology.stats;

public class StatsService {
    public int allSalesSum(int[] Months) {
        int sum = 0;
        for (int i = 0; i < Months.length; i++) {
            sum = sum + Months[i];
        }


        return sum;
    }

    public int averageSum(int[] Months) {
        int Sum = 0;
        int avSum = 0;
        for (int i = 0; i < Months.length; i++) {
            Sum = Sum + Months[i];
            avSum = Sum / 12;
        }

        return avSum;
    }

    public int minSales(int[] Months) {
        int minMonth = 0;

        for (int i = 0; i < Months.length; i++) {
            if (Months[i] <= Months[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(int[] Months) {
        int maxMonth = 0;

        for (int i = 0; i < Months.length; i++) {
            if (Months[i] >= Months[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int maxSalesMonths(int[] Months) {
        int maxMonths = 0;
        ;
        int avSum = 15;

        for (int i = 0; i < Months.length; i++) {

            if (Months[i] > avSum) {
                maxMonths++;
            }
        }

        return maxMonths;
    }

    public int minSalesMonths(int[] Months) {
        int minMonths = 0;
        ;
        int avSum = 15;

        for (int i = 0; i < Months.length; i++) {

            if (Months[i] < avSum) {
                minMonths++;
            }
        }

        return minMonths;
    }
}