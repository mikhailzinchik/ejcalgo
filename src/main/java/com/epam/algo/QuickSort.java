package com.epam.algo;

public class QuickSort {
    public static void quickSort(int[] array, int lowElem, int highElem) {
        if (array.length == 0)
            return;
        if (lowElem >= highElem)
            return;
        int middle = lowElem + (highElem - lowElem) / 2;
        int mainElem = array[middle];
        int i = lowElem, j = highElem;
        while (i <= j) {
            while (array[i] < mainElem) {
                i++;
            }
            while (array[j] > mainElem) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (lowElem < j)
            quickSort(array, lowElem, j);
        if (highElem > i)
            quickSort(array, i, highElem);
    }
}