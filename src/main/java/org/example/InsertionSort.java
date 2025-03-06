package org.example;

public class InsertionSort {
    int[] arr;

    InsertionSort(int[] arr) {
        this.arr = arr.clone(); //cloning to have a separate instance of the array
    }

    private void insertItem(int sortedUpto) {
        int key = arr[sortedUpto + 1];
        for (;sortedUpto >= 0 && arr[sortedUpto] > key; sortedUpto--) {
            shiftItems(sortedUpto);

        }
        arr[sortedUpto + 1] = key;
    }

    private void shiftItems(int target) {
        arr[target + 1] = arr[target];
    }

    public int[] sort() {
        for (int i = 1; i < arr.length; i++) {
            int sortedUpto = i - 1;
            insertItem(sortedUpto);
        }
        return arr;
    }


}
