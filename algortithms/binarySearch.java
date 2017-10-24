//binary search algorithm. i added a test using scanner. remember binary search works when elements are sorted. give it a try.
package com.lesson;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] a = new int[10];

        System.out.println("enter 10 numbers in order:");
        for (int i =0; i< a.length;i++){
            a[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("enter number to find");
        int key = scanner.nextInt();
        System.out.println(binarySearch(key,a));
    }

    public static int binarySearch(int key, int []a){
        int lo = 0;
        int hi = a.length-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if (key < a[mid]) {
                hi = mid -1;
            } else if (key > a[mid]) {
                lo = mid +1;
            } else{
                return mid;
            }
        }
        return -1;
    }
}

// char [] shift = s.toCharArray();
//         while(left < right){
//             right--;
//             char temp = shift[left];
//             shift[left] = shift[right];
//             shift[right] = temp;
//             left++;
//             }
//         }
//         return s;



//         static long count(int[] numbers, int k) {
//         int len = numbers.length;
//         int numbProducts = 0;
        
//         for(int i =0; i<len; ++i){
//             for(int j =i; j < len; ++j){
//                 int product =1;
                
//                 for(int p =i; p<=j;++p){
//                     product *= numbers[p];
//                 }
//                 if(product < k){
//                     ++numbProducts;
//                 } else{
//                     break;
//                 }
//             }
//         }
//         return numbProducts;
//     }