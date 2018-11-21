package com.epam.algo;

public class MergeSort {
    private int[] inputArray;
    private int[] helperArray;

    private void sort(int[] inputArray) {
        this.inputArray = inputArray;
        this.helperArray = new int[inputArray.length];
        mergeSort(0, inputArray.length - 1);
    }

    private void mergeSort(int firstBoundary, int lastBoundary) {
        if (firstBoundary < lastBoundary) {
            int middleBoundary = firstBoundary + (lastBoundary - firstBoundary) / 2;
            mergeSort(firstBoundary, middleBoundary);
            mergeSort(middleBoundary + 1, lastBoundary);
            merge(firstBoundary, middleBoundary, lastBoundary);
        }
    }

    private void merge(int firstBoundary, int middleBoundary, int lastBoundary) {
        for (int i = firstBoundary; i <= lastBoundary; i++) {
            this.helperArray[i] = this.inputArray[i];
        }
        int i = firstBoundary;
        int j = middleBoundary + 1;
        int k = lastBoundary;
        while (i <= middleBoundary && j <= lastBoundary) {
            if (this.helperArray[i] <= this.helperArray[j]) {
                this.inputArray[k] = this.helperArray[i];
                i++;
            } else {
                this.inputArray[k] = this.helperArray[j];
                j++;
            }
            k++;
        }
    }
}