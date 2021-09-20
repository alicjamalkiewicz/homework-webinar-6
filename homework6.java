package pl.test.Webinar6Homework;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

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

        //a.definiowanie tablicy
        int[] array10 = {1, 10, 4, 3, 7, -5, 0, -1, -3, -7};

        //b.drukowanie tablicy
        System.out.println(Arrays.toString(array10));

        //c.wyznacz min/max
        Arrays.sort(array10);
        System.out.println("min = " + array10[0]);
        System.out.println("max = " + array10[array10.length - 1]);

        //e.średnia
        int sum = 0;
        for (int element : array10)
            sum = sum + element;

        System.out.println(sum);

        float element = array10.length;
        System.out.println(element);

        float average = sum / element;
        System.out.println(average);

        //f.liczba elementów mniejszych od średniej
        int smallerElements= 0;
        for (int arrayElements : array10){
            if (arrayElements < average);
            smallerElements = smallerElements + 1;

            System.out.println(smallerElements);
        }

        //g.liczba elementów wiekszych od średniej
        int biggerElements= 0;
        for (int arrayElements : array10){
            if (arrayElements > average);
            biggerElements = biggerElements + 1;

            System.out.println(biggerElements);
        }

        //h.tablica drukowana od odtatniego elementu
        for(int i = array10.length-1; 1>=0; i--){
            System.out.println(array10[i]);
        }

    }

}