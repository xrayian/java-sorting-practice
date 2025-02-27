package org.example;

public class BubbleSort {
    int[] arr;

    BubbleSort(int[] arr) {
        this.arr = arr.clone();
    }

    private void bubbleToTop(int boundary) {
        int i = 0;
        for (; i < arr.length - boundary - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swap(i, i + 1);
            }
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sort() {

        for (int i = 0; i < arr.length - 1; i++) {
            bubbleToTop(i);
        }

        return arr;
    }


}
