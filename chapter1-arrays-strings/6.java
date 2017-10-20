//implement a method to perform a basic string compression using the counts of repeated characters. for example, the string aabcccccaaa would become a2b1c5a3. if the "compressed" string would not become smaller than the original string, your method should return the original string. you can assume the string has only uppercase and lowercase letters.
package com.lesson;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();
        System.out.println(s);
        System.out.println(compressBad(s));
    }


    public static String compressBad(String s){
        String compressedString = "";
        int countConsecutive = 0;
        for (int i =0; i < s.length();i++){
            countConsecutive++;

            if (i+1 >= s.length() || s.charAt(i) != s.charAt(i+1)){
                compressedString += "" + s.charAt(i) + countConsecutive;
                countConsecutive =0;
            }
        } return compressedString.length() < s.length() ? compressedString: s;
    }
}
