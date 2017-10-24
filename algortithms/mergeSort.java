package com.lesson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] merge = new int[10];

        System.out.println("enter 10 numbers to be sorted:");

        for (int i = 0; i < merge.length; i++) {
            merge[i] = scanner.nextInt();
            scanner.nextLine();
        }

        Sort mergeIt = new Sort();
        mergeIt.sort(merge,0,merge.length-1);

        print(merge);


    }

    static class Sort {

        static void merge(int[] a, int l, int m, int r) {
            //size of two subarrays to be merged
            int n1 = m - l + 1;
            int n2 = r - m;

            //create two temp arrays
            int[] Left = new int[n1];
            int[] Right = new int[n2];

            //copy data to the temp arrays
            for (int i = 0; i < n1; ++i)
                Left[i] = a[l + i];
            for (int j = 0; j < n2; ++j)
                Right[j] = a[m + 1 + j];

            //merge the indexes of both temps arrays
            int i = 0, j = 0;

            //do work on the merged arrays
            //start from index onf the new merged arrays
            int k = l;
            while (i < n1 && j < n2) {
                if (Left[i] <= Right[j]) {
                    a[k] = Left[i];
                    i++;
                } else {
                    a[k] = Right[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                a[k] = Left[i];
                i++;
                k++;
            }
            while (j < n2) {
                a[k] = Right[j];
                j++;
                k++;
            }
        }

        //recursive merge()
        static void sort(int[] a, int l, int r) {
            if (l < r) {
                int middle = (l + r) / 2;

                //sort both halves
                sort(a, l,middle);
                sort(a, middle + 1, r);

                //merge the halves
                merge(a, l, middle, r);
            }
        }
    }

    static void print(int []a){
        for (int i = 0; i < a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}