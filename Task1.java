package homework.lesson4;

public class Task1 {
/*
1. Напишите программу, которая циклически сдвигает элементы
массива вправо на одну позицию, и печатает результат.
Цикличность означает, что последний элемент массива становится
самым первым его элементом.
* 1, 5, 10, 8, 78, 1, 8, 9
* 9, 1, 5, 10, 8, 78, 1, 8
    * */
    public static void main(String[] args) {
        int[] values = {1, 5, 10, 8, 78, 1, 8, 9};

        printArray(values);
    }

    private static void printArray(int[] values) {
        int[] array = new int[values.length];
        array[0] = values[values.length - 1];
        for (int i = 0; i < values.length - 1; i++) {
            array[i + 1] = values[i];
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}


