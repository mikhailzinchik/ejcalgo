package com.epam.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 22, 31, 34, 153};
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 0;
            try {
                count = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            BinarySearch binarySearch = new BinarySearch();
            System.out.println(binarySearch.search(22, arr));

        } catch (IOException e) {
            e.printStackTrace();
        }
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(arr));
        System.out.println(mergeSort);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(bubbleSort);

        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort);

        RadixSort radixSort = new RadixSort();
        radixSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(radixSort);
    }
}