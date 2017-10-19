//given a string, write a function to check if it is a permutation of a palindrome. a palindrome is a word or phrase that is the same forward and backwards. a permutation is a rearrangement of letters.

public static void main(String[] args) {
        //String s = scanner.next();
        String s = "Tact Coa";
        System.out.println(isPermutationofPalindrome(s));

    }


    public static int getCharNumber(Character c){
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');

        int val = Character.getNumericValue(c);
        if (a <= val && val <= z){
            return val - a;
        }
        return -1;
    }

    public static boolean isPermutationofPalindrome(String s) {
        int countOdd = 0;
        int [] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c: s.toCharArray()){
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 ==1){
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <=1;
    }
}