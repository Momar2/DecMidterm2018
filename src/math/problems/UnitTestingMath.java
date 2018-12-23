package math.problems;

import org.testng.Assert;

public class UnitTestingMath {

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        Assert.assertEquals(120,Factorial.factorial(4));

        //Lowest Difference
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
       Assert.assertEquals(1,FindLowestDifference.lowestDiff(array1,array2));

        //Missing Number
        int [] array3 = {1,2,3,4,5,6,7,8,10};
        Assert.assertEquals(9,FindMissingNumber.findMissingNumber(array3,10));

        //Lowest Number
        int [] array4 = {1,36,2,5,8,9,78};
        Assert.assertEquals(1,LowestNumber.findLowestNumber(array4));


    }
}
