package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};


        Arrays.sort(array1);
        int minDiff = array1[1]-array1[0];
        for (int i = 1 ; i != array1.length ; i++) {
            minDiff = Math.min(minDiff, array1[i]-array1[i-1]);
        }
        System.out.println("The lowest difference is " + minDiff);

        Arrays.sort(array2);
        int minDiffer = array2[1]-array2[0];
        for (int i = 1 ; i != array2.length ; i++) {
            minDiff = Math.min(minDiff, array2[i]-array2[i-1]);
        }
        System.out.println("The lowest difference is " + minDiff);



    }

}
