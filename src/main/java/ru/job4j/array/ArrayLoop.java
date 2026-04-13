package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] num = new int[5];
        for (int index = 0; index < num.length; index++) {
            num[index] = index * 2 + 3;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println("Значение элемента " + i + " равно " + num[i]);

        }
    }
}
