package org.example;

public class SelectionSort {
    int[] arr;

    SelectionSort(int[] arr) {
        this.arr = arr.clone();
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int find_max_value_index(int boundary) {
        int max_val = 0;
        int max_index = 0;

        for (int i = 0; i < arr.length - boundary; i++) {
            if (max_val < arr[i]) {
                max_val = arr[i];
                max_index = i;
            }
        }
        return max_index;
    }

    public int[] sort() {

        for (int i = 0; i < arr.length; i++) {
            int max_index = find_max_value_index(i);
            int last_unsorted_index = arr.length - 1 - (i);
            swap(max_index, last_unsorted_index);
        }
        return arr;
    }

}
