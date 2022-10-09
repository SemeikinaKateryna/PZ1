package arrays;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Enter N, please:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N + 15][N + 15];

        System.out.println("Generated array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) ((Math.random() * (2 * (1 + N + 15)) - (1 + N + 15)));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int evenSum = 0; //сума парних чисел
        int oddSum = 0; //сума непарних чисел
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum += arr[i][j];
                } else if (arr[i][j] % 2 == 1) {
                    oddSum += arr[i][j];
                }
            }
        }

        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                for (int k = 0; k < arr.length; k++)
                    for (int l = 0; l < arr[i].length; l++) {
                        //якщо сума парних більше, то сортуємо за зростанням
                        if (evenSum > oddSum) {
                            if (arr[i][j] < arr[k][l]) {
                                int tmp = arr[i][j];
                                arr[i][j] = arr[k][l];
                                arr[k][l] = tmp;
                            }
                        } else {
                            //інакше за спаданням
                            if (arr[i][j] > arr[k][l]) {
                                int tmp = arr[i][j];
                                arr[i][j] = arr[k][l];
                                arr[k][l] = tmp;
                            }
                        }
                    }
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
