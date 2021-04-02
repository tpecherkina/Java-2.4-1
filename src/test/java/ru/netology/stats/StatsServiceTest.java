package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumOfSales() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = stat.sumOfSales(months);

        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = stat.averageSum(months);

        assertEquals(expected, actual);
    }

    @Test
    void maxMonth() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = stat.maxMonth(months);

        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = stat.minMonth(months);

        assertEquals(expected, actual);
    }

    @Test
    void lowerThanAverage() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = stat.lowerThanAverage(months);

        assertEquals(expected, actual);
    }

    @Test
    void higherThanAverage() {
        StatsService stat = new StatsService();

        int[] months = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = stat.higherThanAverage(months);

        assertEquals(expected, actual);
    }
}
