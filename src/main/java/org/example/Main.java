package org.example;

import java.util.Scanner;

public class Main {

    public static int[] promptUserForArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an unsorted array: (separated by comma space [ex: 1, 2, 3]) ");
        String arr_str = sc.nextLine();
        String[] strUnsortedArr = arr_str.split(",");

        int[] unsortedArr = new int[strUnsortedArr.length];

        for (int i = 0; i < strUnsortedArr.length; i++) {
            unsortedArr[i] = Integer.parseInt(strUnsortedArr[i].trim());
        }

        return unsortedArr;
    }

    public static void main(String[] args) {
        int[] arr = promptUserForArray();

        System.out.println("\nUnsorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int[] sortedArr = new SelectionSort(arr).sort();
        int[] sortedArr2 = new BubbleSort(arr).sort();
        int[] sortedArr3 = new InsertionSort(arr).sort();


        System.out.println("\n\nSorted Array:");

        for (int i : sortedArr) {
            System.out.print(i + " ");
        }
        System.out.println("[Selection Sort]");

        for (int i : sortedArr2) {
            System.out.print(i + " ");
        }
        System.out.println("[Bubble Sort]");

        for (int i : sortedArr3) {
            System.out.print(i + " ");
        }
        System.out.println("[Insertion Sort]");

    }
}