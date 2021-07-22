package ru.geekbrains.lesson.two;

import java.util.Random;

public class Main {

    //region Задание № 1
    public static void doFirstArr() {
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание № 1.");
        System.out.println("Первоначальный массив: ");
        for (int j = 0; j < 10; j++){
            System.out.print(firstArr[j] + " ");
        }
        System.out.println();
        System.out.println("Преобразованный массив: ");
        for (int i = 0; i < 10; i++) {
            if (firstArr[i] == 0) {
                firstArr[i] = 1;
                System.out.print(1 + " ");
            } else {
                firstArr[i] = 0;
                System.out.print(0 + " ");
            }
        }
        System.out.println();
        System.out.println("Конец задания № 1.");
    }
    //endregion
    //region Задаение № 2
    public static void doSecondArr() {
        int[] secondArr = new int[8];
        System.out.println("Задание № 2.");
        System.out.println("Заполняем массив размером " + secondArr.length);
        for (int j = 0; j < 8; j++) {
            secondArr[j] = (j * 3);
            System.out.print(secondArr[j] + " ");
        }
        System.out.println();
        System.out.println("Конец задания № 2.");
    }
    //endregion
    //region Задание № 3
    public static void doThirdArr() {
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание № 3.");
        System.out.println("Первоначальный массив: ");
        for (int j = 0; j < thirdArr.length; j++){
            System.out.print(thirdArr[j] + " ");
        }
        System.out.println();
        System.out.println("Увеличиваем в 2 раза значения массива, которые меньше 6:");
        for (int k = 0; k < thirdArr.length; k++) {
            int factor = 2;
            if (thirdArr[k] < 6) {
                System.out.print((thirdArr[k] * factor) + " ");
            } else {
                System.out.print(thirdArr[k] + " ");
            }
        }
        System.out.println();
        System.out.println("Конец задания № 3.");
    }
    //endregion
    //region Задание № 4
    public static void doFourthArr() {
        int[][] fourthArr = new int[3][3];
        System.out.println("Задание № 4.");
        System.out.printf("Заполняем диагонали массива %dx%d единицами: %n", fourthArr.length, fourthArr.length);
        for (int l = 0; l < fourthArr.length; l++) {
            for (int m = 0; m < fourthArr.length; m++) {
                if (l == m) {
                    fourthArr[l][m] = 1;
                } else {
                    fourthArr[l][fourthArr.length - 1 - l] = 1;
                }
                System.out.print(fourthArr[l][m]+ " ");
            }
            System.out.println();
        }
        System.out.println("Завершение задания № 4.");
    }
    //endregion
    //region Задание № 5
    public static void doFifthArr(){
        Random factor = new Random();
        int[] fifthArr = new int[10];
        System.out.println("Задание № 5.");
        System.out.printf("Инициализируем массив длинной %d: %n", fifthArr.length);
        for (int i = 0; i < fifthArr.length; i++) {
            fifthArr[i] = factor.nextInt(10);
            System.out.print(fifthArr[i] + " ");
        }
        int min = fifthArr[0];
        int max = fifthArr[0];
        for (int i = 0; i < fifthArr.length; i++) {
            if (fifthArr[i] > max) {
                max = fifthArr[i];
            }
        }
        for (int i = 0; i < fifthArr.length; i++) {
            if (fifthArr[i] < min) {
                min = fifthArr[i];
            }
        }
        System.out.println();
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        System.out.println("Завершение задания № 5.");
    }
    //endregion
    //region Задание № 6
    public static void doSixthArr() {
        Random factor = new Random();
        int[] sixthArr = new int[16];
        System.out.println("Задание № 6.");
        System.out.printf("Инициализируем массив длинной %d: %n", sixthArr.length);
        for (int i = 0; i < sixthArr.length; i++) {
            sixthArr[i] = factor.nextInt(10);
            System.out.print(sixthArr[i] + " ");
        }

    }
    //endregion
    //region Задание № 7
    public static void doSeventhArr() {

    }
    //endregion
    public static void main(String[] args) {
        doFirstArr();
        System.out.println("====================");
        doSecondArr();
        System.out.println("====================");
        doThirdArr();
        System.out.println("====================");
        doFourthArr();
        System.out.println("====================");
        doFifthArr();
        System.out.println("====================");
    }
}
