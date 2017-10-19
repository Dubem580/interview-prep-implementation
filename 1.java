//determine an algorithm to determine if a string has unique characters.
//O(n) time complexitiy, n is length of the string and space complexity is O(1) guaranteeing it will not exceed 128 characters 
public static void main(String[] args) {

        String s = scanner.next();
        scanner.nextLine();
        boolean checker = isUnique(s);
        System.out.println(checker);
    }

    public static boolean isUnique(String s){
        if (s.length() > 128){
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i=0;i<s.length();i++){
            int val = s.charAt(i);
            if (char_set[val]){
                return false;
            } else{
                char_set[val] = true;
            }
        }
        return true;
    }
}

//check  permutation: given two strings, write a method to decide if one is a permutation of the other.
public static void main(String[] args) {
        String s = scanner.next();
        scanner.nextLine();
        String t = scanner.next();
        scanner.nextLine();

        System.out.println(permutation(s,t));

    }


    public static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s.toLowerCase()).equals(sort(t));
    }

}


//write a method to replace all sapces in a string with "%20". you may assume that the string as sufficient space at the end to hold the additional characters, and that you are given the 'true'length of the string.

public static void main(String[] args) {

        String s = "Times are changing to suit the youth and their dreams                                  ";
        char[] s1 = s.toCharArray();
        int tru = 53;

        System.out.println("before replacing spaces = " + s);

        //replaceSpace(s1,19);
        System.out.println("after replacing with %20 =\n" + replaceSpace(s1,tru));




    }


    public static String replaceSpace(char[] s, int tru) {
        int spaces = 0, index = 0;
        for (int i = 0; i < tru; i++) {
            if (s[i] == ' ') {
                spaces++;
            }
        }
        index = tru + spaces * 2;
        if (tru < s.length){
            s[tru] = '\0';
        }
        for (int i = tru-1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index = index - 3;
            } else {
                s[index - 1] = s[i];
                index--;
            }
        }
        return new String(s);
    }
}

