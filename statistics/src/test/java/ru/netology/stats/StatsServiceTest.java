package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    StatsService service = new StatsService();
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void salesSum() {
        int actual = service.salesSum(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        float actual = service.averageSum(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void maxSaleMonth() {
        float actual = service.maxSaleMonth(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void minSaleMonth() {
        float actual = service.minSaleMonth(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void quantityMonthBelowAverage() {
        float actual = service.quantityMonthBelowAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void quantityMonthAboveAverage() {
        float actual = service.quantityMonthAboveAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}