package ru.netology.services;
public class StatsService {

    public int fullSum(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        return sum;
    }

    public int averageAmount(int[] sales) {
        int average = 0;

        for (int i = 0; i < sales.length; i++) {
            average += sales[i];
        }

        return average / 12;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        //maxSales
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int salesBelowAverage(int[] sales) { //salesBelowAverage
        int lowMonths = averageAmount(sales);
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < lowMonths) {
                month++;
            }
        }
        return month;
    }

    public int salesAboveAverage(int[] sales) { //salesAboveAverage
        int lowMonths = averageAmount(sales);
        int month = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > lowMonths) {
                month++;
            }
        }
        return month;
    }
}
