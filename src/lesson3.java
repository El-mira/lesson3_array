import java.util.Arrays;

public class lesson3 {

    public static void main(String[] args) {
        // Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("Задание 1:");
        int[] mass100 = new int[100];
        for (int i=0 ; i < mass100.length; i++) {
            mass100[i] = (i + 1);
        }
        System.out.println(Arrays.toString(mass100));
        System.out.println();

        // Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание 2:");
        int[] mass01 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Было:");
        System.out.println(Arrays.toString(mass01));
        for (int i = 0; i < mass01.length; i++) {
            mass01[i] = 1 - mass01[i];
        }
        System.out.println("Стало:");
        System.out.println(Arrays.toString(mass01));
        System.out.println();


// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание 3:");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Было:");
        System.out.println(Arrays.toString(array3));
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
        }
        System.out.println("Стало:");
        System.out.println(Arrays.toString(array3));
        System.out.println();

        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        System.out.println("Задание 4:");
        int[][] m = new int[5][5];
        for (int i = 0; i < m.length; i++) {
            m[i][m.length - 1 - i] = 1;
            m[i][i] = 1;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
        System.out.println("Задание 5:");
        metodLeninitialValue ( 9,7);
        System.out.println();

        // Задать одномерный массив и найти в нем минимальный и максимальный элементы
        System.out.println("Задание 6:");
        int[] array6 = new int[10];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array6));
        int min = array6[0];
        int max = array6[0];
        for (int element: array6) {
            if (min > element) {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println();
    }

    public static void metodLeninitialValue(int len, int initialValue){
        int[] array5 = new int[len];
        for (int element: array5){
           element = initialValue;
        }
        System.out.println(Arrays.toString(array5));
    }
}


