package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void shouldSumSale() {
        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        int actual = service.sumSales(month);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAvrgSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.avrgSales(month);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        int actual = service.maxSales(month);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        int actual = service.minSales(month);

        assertEquals(expected, actual);

    }

    @Test
    void shouldUnderSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        int actual = service.underSales(month);

        assertEquals(expected, actual);
    }

    @Test
    void shouldUpperSale() {
        StatsService service = new StatsService();
        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        int actual = service.upperSales(month);

        assertEquals(expected, actual);
    }
}