package ru.netology.service;

public class MonthsService {
    public int AllSalesSum(int[] Months) {
        int sum = 0;
        for (int i = 0; i < Months.length; i++) {
            sum = sum + Months[i];
        }


        return sum;
    }

    public int averageSum(int[] Months) {
        int Sum = 0;
        int AvSum = 0;
        for (int i = 0; i < Months.length; i++) {
            Sum = Sum + Months[i];
            AvSum = Sum / 12;
        }

        return AvSum;
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
        int AvSum = 15;

        for (int i = 0; i < Months.length; i++) {

            if (Months[i] > AvSum) {
                maxMonths++;
            }
        }

        return maxMonths;
    }

    public int MinSalesMonths(int[] Months) {
        int minMonths = 0;
        ;
        int AvSum = 15;

        for (int i = 0; i < Months.length; i++) {

            if (Months[i] < AvSum) {
                minMonths++;
            }
        }

        return minMonths;
    }
}