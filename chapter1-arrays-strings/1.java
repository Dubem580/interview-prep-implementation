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

//check the permutation: given two strings, write a method to decide if one is a permutation of the other.
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




