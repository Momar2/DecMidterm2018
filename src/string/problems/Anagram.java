package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            String s = "STATES";
            String t = "TASTES";
            System.out.println(anaGram(s,t));
        }

        public static boolean anaGram(String run1, String run2) {

            if (run1.length() != run2.length()) {

                return false;
            }

            run1=run1.toUpperCase();
            run2=run2.toUpperCase();
            char[] run1c= run1.toCharArray();
            Arrays.sort(run1c);
            char[] run2c= run1.toCharArray();
            Arrays.sort(run2c);
            return Arrays.equals(run1c, run2c);
        }



    }
