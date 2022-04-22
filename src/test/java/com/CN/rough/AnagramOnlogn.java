package com.CN.rough;

// Java program to check if two strings
// are anagrams of each other
class AnagramOnlogn {

    static int NO_OF_CHARS = 256;

    // function to check if two strings
// are anagrams of each other
    static boolean areAnagram(char[] str1,
                              char[] str2) {

        // Create a count array and initialize
        // all values as 0
        int[] count = new int[NO_OF_CHARS];
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i < str1.length; i++) {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }

        // If both strings are of different
        // length. Removing this condition
        // will make the program fail for
        // strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;

        // See if there is any non-zero
        // value in count array
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0) {
                return false;
            }
        return true;
    }

    // Driver code
    public static void main(String[] args) {
        char str1[] = "geeksforgeeks".toCharArray();
        char str2[] = "forgeeksgeeks".toCharArray();
        String str11="anura";
        String str22="garuna";


        // Function call
        if (isAnagram(str11, str22))
            System.out.print("The two strings are " +
                    "anagram of each other");
        else
            System.out.print("The two strings are " +
                    "not anagram of each other");
    }


    public static boolean isAnagram(String str1, String str2) {

        char[] ch1 = new char[256];

        for (int i = 0; i < str1.length(); i++) {
            ch1[str1.charAt(i) - 'a']++;
            ch1[str2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != 0) {
                return false;
            }
        }
        return true;
    }
}



