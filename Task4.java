package homework.lesson4;

import java.util.Arrays;

public class Task4 {
    /*
    * 4. Написать функцию linearize, которая принимает в качестве
параметра двумерный массив
и возвращает одномерный массив со всеми элементами
двумерного.
    * */
    public static void main(String[] args) {
        int[][] twoDimensionalArray = {
                {1, 2, 3,},
                {3, 4, 5}
        };
        int[] array = linearize(twoDimensionalArray);
        System.out.println(Arrays.toString(array));

    }

    private static int[] linearize(int[][] twoDimensionalArray) {
        int index = 0;
        int[] oneDimensionalArray = new int[twoDimensionalArray.length * twoDimensionalArray[0].length];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                oneDimensionalArray[index++] = twoDimensionalArray[i][j];
            }
        }
        return oneDimensionalArray;
    }
}
