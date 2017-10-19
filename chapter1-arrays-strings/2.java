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
