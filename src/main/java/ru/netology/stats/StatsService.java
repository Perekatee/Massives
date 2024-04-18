package ru.netology.stats;

public class StatsService {
    public long allSalesSum(long[] months) {
        long sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];
        }


        return sum;
    }

    public long averageSum(long[] months) {
        long Sum = 0;
        long avSum = 0;
        for (int i = 0; i < months.length; i++) {
            Sum = Sum + months[i];
            avSum = Sum / 12;
        }

        return avSum;
    }

    public int minSales(long [] months) {
        int minMonth = 0;

        for (int i = 0; i < months.length; i++) {
            if (months[i] <= months[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long [] months) {
        int maxMonth = 0;

        for (int i = 0; i < months.length; i++) {
            if (months[i] >= months[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long maxSalesMonths(long[] months) {
        long maxMonths = 0;
        long avSum = averageSum(months);

        for (int i = 0; i < months.length; i++) {

            if (months[i] > avSum) {
                maxMonths++;
            }
        }

        return maxMonths;
    }

    public long minSalesMonths(long[] months) {
        long minMonths = 0;
        long avSum = averageSum(months) ;

        for (int i = 0; i < months.length; i++) {

            if (months[i] < avSum) {
                minMonths++;
            }
        }

        return minMonths;
    }
}