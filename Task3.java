package homework.lesson4;

public class Task3 {
    /*
    * Заданы 2 массива целых чисел произвольной длины. 
    Написать программу, создающую третий массив,
представляющий собой слияние 2-х заданных.
1-й массив: {1, 2, 3, 4, 5}
2-й массив: {5, 6, 7}
Результат: {1, 5, 2, 6, 3, 7, 4, 5}
* */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7};
        int[] arrays = new int[array1.length + array2.length];

        mergeArrays(array1, array2, arrays);
    }

    private static void mergeArrays(int[] array1, int[] array2, int[] arrays) {
        for (int i = 0, index1 = 0, index2 = 0; i < arrays.length; ) {

            if (index1 < array1.length && index2 < array2.length) {
                arrays[i++] = array1[index1++];
                arrays[i++] = array2[index2++];
            } else if (index1 < array1.length) {
                arrays[i++] = array1[index1++];
            } else {
                arrays[i++] = array2[index2++];
            }
        }
        for (int value : arrays) {
            System.out.print(value + " ");
        }
    }
}

