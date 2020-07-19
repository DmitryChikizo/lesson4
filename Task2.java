package homework.lesson4;

public class Task2 {
    /*
    2. Написать программу, удаляющую все повторяющиеся целые
    числа из массива и печатающую результат.*
    1 1 2 2 3 4
    1 0 2 0 3 4
    * */
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 4};
        printArray(array);
        printArrayWithDuplicate(array);
    }

    private static void printArrayWithDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[j]) {
                    array[i] = array[i];
                } else {
                    array[j] = 0;
                }
            }
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
