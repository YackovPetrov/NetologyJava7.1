package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void fullSum() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.fullSum(salesData);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageAmount() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageAmount(salesData);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(salesData);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(salesData);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void salesBelowAverage() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.salesBelowAverage(salesData);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void salesAboveAverage() {
        StatsService service = new StatsService();

        int[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.salesAboveAverage(salesData);

        Assertions.assertEquals(expected, actual);

    }
}
