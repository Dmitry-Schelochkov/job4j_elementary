package ru.job4j.condition;

public class RectangleArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = i * h;
        return s;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(4, 1);
        double result2 = RectangleArea.square(6, 2);
        double result3 = RectangleArea.square(12, 3);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
        System.out.println(" p = 8, k = 4, s = 6.75, real = " + result3);
    }
}
