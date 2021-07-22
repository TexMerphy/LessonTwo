package ru.geekbrains.lesson.two;

public class Main {
    //region Задание № 1
    public static void doFirstArr() {
        int[] firstArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Задание № 1.");
        System.out.println("Первоначальный массив: ");
        for (int j = 0; j < 10; j++){
            System.out.print(firstArr[j]);
        }
        System.out.println();
        System.out.println("Преобразованный массив: ");
        for (int i = 0; i < 10; i++) {
            if (firstArr[i] == 0) {
                firstArr[i] = 1;
                System.out.print(1);
            } else {
                firstArr[i] = 0;
                System.out.print(0);
            }
        }
        System.out.println();
        System.out.println("Конец задания № 1.");
    }
    //endregion
    //region Задаение № 2
    public static void doSecondArr() {
        int[] secondArr = new int[8];
        System.out.println("Задание № 2");
        for (int j = 0; j < 8; j++) {
            secondArr[j] = (j * 3);
            System.out.println(secondArr[j]);
        }
    }

    public static void doThirdArr() {
        int[] thirdArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задание № 3");// задание № 3
        for (int k = 0; k < thirdArr.length; k++) {
            if (thirdArr[k] <= 6) {
                System.out.println(thirdArr[k] * 2);
            } else {
                System.out.println(thirdArr[k]);
            }
        }
    }

    public static void doFourthArr() {
        int[][] fourthArr = new int[3][3];
        System.out.println("Задание № 4");
        for (int l = 0; l < fourthArr.length; l++) {
            for (int m = 0; m < fourthArr.length; m++) {
                if (l == m) {
                    fourthArr[l][m] = 1;
                } else {
                    fourthArr[l][m] = 0;
                }
                System.out.print(fourthArr[l][m]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        doFirstArr();
        System.out.println("====================");
        doSecondArr();
    }
}