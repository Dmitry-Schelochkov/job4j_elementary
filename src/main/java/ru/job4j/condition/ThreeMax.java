package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (second >= first && second >= third) {
            result = second;
        }
        if (first >= second && first >= third) {
            result = first;
        }
        return result;
    }
}