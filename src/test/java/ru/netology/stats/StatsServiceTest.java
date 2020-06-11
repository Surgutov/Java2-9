package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSumOfSalesInYear() {
        StatsService service = new StatsService();
        int expected = 183;
        int actual = service.sumOnYear(service.getSalesData());
        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();
        double expected = 15.25;
        double actual = service.averageSum();
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthMaxSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberMonthMaxSales();
        assertEquals(expected, actual);
    }

    @Test
    void monthCountLowAverage() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.monthCountLowAverage();
        assertEquals(expected, actual);
    }

    @Test
    void numberMonthMinSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.numberMonthMinSales();
        assertEquals(expected, actual);
    }

    @Test
    void monthCountUpperAverage() {
        StatsService service = new StatsService();
        int expected = 6;
        int actual = service.monthCountUpperAverage();
        assertEquals(expected, actual);
    }
}