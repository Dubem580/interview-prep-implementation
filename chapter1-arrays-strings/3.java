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

