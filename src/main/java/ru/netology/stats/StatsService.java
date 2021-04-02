package ru.netology.stats;

public class StatsService {

    public int sumOfSales (int[] months){
        int sum = 0;
        for (int i = 0; i < months.length; i++) {
            sum = sum + months[i];
        }
        return sum;
    }


    public int averageSum(int[] months){
        int sum = 0;
        for (int month : months) {
            sum += month;
        }
        return sum / months.length;
    }

    public int maxMonth(int[] months){
        int max=months[0];
        int count=0;
        for (int i = months.length - 1; i >= 0; i--)  {
            int month = months[i];
            if (max < month) {
                max = month;
                count = i;
            }
            }
        return count+1;
    }

    public int minMonth(int[] months){
        int min=months[0];
        int count=0;
        for (int i = 0; i < months.length; i++) {
            int month = months[i];
            if (min > month) {
                min = month;
                count = i;
            }
        }
        return count+1;
    }


    public int lowerThanAverage(int[] months){
        int count = 0;
        for (int month : months) {
            if (month < averageSum(months)) count++;
        }
        return count;
    }

    public int higherThanAverage(int[] months){
        int count = 0;
        for (int month : months) {
            if (month > averageSum(months)) count++;
        }
        return count;
    }
}