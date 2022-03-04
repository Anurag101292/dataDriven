package com.CN.rough;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
        public static int lengthOfLongestSubstring(String s) {
            char[] ch=s.toCharArray();
            int n =ch.length;
            Set<Character> set= new HashSet<>();
            int maxdistance =0;
            int i=0,j=0;
            while(j<n)
            {
                if( set.contains(ch[j]))
                {
                    if(ch[i]!=ch[j])
                    {
                        set.remove(ch[i]);
                        i++;
                    }
                    else{
                        i++;j++;
                    }

                }
                else{
                    set.add(ch[j]);
                    j++;
                }
                maxdistance=Math.max(maxdistance,j-i);

            }

            maxdistance=Math.max(maxdistance,j-i);

            return maxdistance;
        }

    public static void main(String[] args) {
    int n =lengthOfLongestSubstring("abcabcbb");
        System.out.println(n);
    }
    }
// qrsvbsab
// 12345
// rsvb



//z  a  b   c    a   b     c     b   b

// h key a   value true

//    int maxdistance =0 ;
//     int i =2  j -i   distance between two counter

// maxdistance =    Math.max(maxdistance,i);
// 2

