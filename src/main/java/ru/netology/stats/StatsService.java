package ru.netology.stats;

public class StatsService {
    public int sumOnYear(int[] salesDataByYear) {
        int sum = 0;
        for (int sale : salesDataByYear) {
            sum = sale + sum;
        }
        System.out.println("Сумма продаж за год " + sum);
        System.out.println();
        return sum;
    }

    public double averageSum() {
        int sum = sumOnYear(getSalesData());
        double month = 12;
        double average = sum / month;
        System.out.println("Средняя сумма продаж за год " + average);
        return average;
    }

    public int numberMonthMaxSales() {
        int[] salesDataByYear = getSalesData();
        int monthNumb = 0;
        for (int i = 1; i < 11; i++) {
            if (salesDataByYear[monthNumb] < salesDataByYear[i]) {
                monthNumb = i;
            }

        }
        return monthNumb;
    }

    public int monthCountLowAverage() {
        double average = averageSum();
        int monthCount = 0;
        int[] salesDataByYear = getSalesData();
        for (int i = 0; i < 12; i++) {
            if (average > salesDataByYear[i]) {
                monthCount++;
            }
            }
        return monthCount;
    }

    public int[] getSalesData() {
        int[] sales = new int[12];
        sales[0] = 8;
        sales[1] = 15;
        sales[2] = 13;
        sales[3] = 15;
        sales[4] = 17;
        sales[5] = 20;
        sales[6] = 19;
        sales[7] = 20;
        sales[8] = 7;
        sales[9] = 17;
        sales[10] = 14;
        sales[11] = 18;
        return sales;
    }
}
