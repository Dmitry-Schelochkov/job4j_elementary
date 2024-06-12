package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int one = 0;
        int two = array.length - 1;
        while (one < two) {
            int sum = array[one] + array[two];
            if (sum == target) {
                return new int[] {one, two};
            } else if (sum < target) {
                one++;
            } else {
                two--;
            }
        }
        return new int[0];
    }
}

