package pl.test.Webinar6Homework;

import java.util.Arrays;

public class homework6 {
    public static void main(String[] args) {

        System.out.println("---EXCERCISE---2---");
        String testuj = "testuj";

        StringBuilder testujArray = new StringBuilder();

        testujArray.append(testuj);
        //System.out.println(testujArray);
        testujArray.reverse();
        System.out.println(testujArray);

        System.out.println("---other version---");

        String testujSecondVersion = "testujSecondVersion";
        char[] secondArray = testujSecondVersion.toCharArray();
        for (int i = secondArray.length - 1; i >= 0; i--)
            System.out.println(secondArray[i]);

        System.out.println("---EXCERCISE---3---");
        System.out.println("---a---");
        int[] Array10 = new int[21];
        for (int i = -10; i <= 10; i++) {
            Array10[i] = i + 1;
            System.out.println(Arrays.toString(Array10));
            System.out.println(Array10[5]);
        }

    }
}