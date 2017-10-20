//there are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. given two strings, write a function to check if they are one edit (or zero edits) away. time complexity is O(n). n is the length of the smaller string

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s1 = scanner.next();
        scanner.nextLine();
        String s2 = scanner.next();
        boolean isOneEdit = oneEditAway(s1,s2);
        System.out.println(s1 + " , " + s2 + " -> " + isOneEdit);

    }

//apple -> apple
//aple -> apple

    public static boolean oneEditAway(String one, String two){
        if (one.length() == two.length()){
            return oneReplaceAway(one, two);
        } else if (one.length() +1 == two.length()){
            return oneInsertAway(one, two);
        } else if (one.length() - 1 == (two.length())){
            return oneInsertAway(two, one);
        }
        return false;
    }



    public static boolean oneReplaceAway(String one, String two){
        boolean difference = false;
        for (int i =0; i<one.length();i++){
            if (one.charAt(i) != two.charAt(i)){
                if (difference){
                    return false;
                }

                difference = true;
            }
        }
        return true;
    }


    public static boolean oneInsertAway(String one, String two){
        int index1 = 0;
        int index2 = 0;
        while (index2 < two.length() && index1 < one.length()){
            if (one.charAt(index1) != two.charAt(index2)){
                if (index1 != index2){
                    return false;
                }
                index2++;
            }else {
                index1++;
                index2++;
            }
        }return true;
    }
}