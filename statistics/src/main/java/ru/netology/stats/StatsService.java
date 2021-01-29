package ru.netology.stats;

public class StatsService {

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float averageSum(int[] sales) {
        return (float) salesSum(sales) / sales.length;
    }

    public int maxSaleMonth(int[] sales) {
        int maxSale = sales[0];
        int month = 1;
        int monthMax = 0;
        for (int sale : sales) {
            if (sale >= maxSale) {
                maxSale = sale;
                monthMax = month;
            }
            month++;
        }
        return monthMax;
    }

    public int minSaleMonth(int[] sales) {
        int minSale = sales[0];
        int month = 1;
        int monthMin = 0;
        for (int sale : sales) {
            if (sale <= minSale) {
                minSale = sale;
                monthMin = month;
            }
            month++;
        }
        return monthMin;
    }

    public int quantityMonthBelowAverage(int[] sales) {
        float average = averageSum(sales);
        int quantityMonth = 0;
        for (int sale : sales) {
            if (sale < average) {quantityMonth++;}
        }
        return quantityMonth;
    }

    public int quantityMonthAboveAverage(int[] sales) {
        float average = averageSum(sales);
        int quantityMonth = 0;
        for (int sale : sales) {
            if (sale > average) {quantityMonth++;}
        }
        return quantityMonth;
    }
}
