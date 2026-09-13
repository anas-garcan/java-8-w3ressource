package com.anas.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMain {
    static void main() {
        System.out.println("----------------------------------------------1. Calculer la moyenne des entiers à l'aide de flux------------------------------------------------");
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        System.out.println(" the average of a list of integers\n"+UtilsStream.avgOfList(l));

        System.out.println("----------------------------------------------2. Convert strings to upper/lowercase using streams------------------------------------------------");
        List<String> ls = new ArrayList<>();
        ls.add("Anas");
        ls.add("Ayman");
        ls.add("Mehdi");
        ls.add("Yahya");
        ls.add("Jad");
        ls.add("Yasmine");

        System.out.println("Conversion to uppercase\n"+UtilsStream.ConvertStringsToUpperCase(ls));
        System.out.println("Conversion to lowercase\n"+UtilsStream.ConvertStringsToLowerCase(ls));


        System.out.println("----------------------------------------------3. Sum even and odd numbers in list using streams------------------------------------------------");
        List<Double> ld = new ArrayList<>();
        ld.add(1.0);
        ld.add(2.0);
        ld.add(3.0);
        ld.add(4.0);
        ld.add(6.0);
        ld.add(8.0);
        ld.add(7.0);
        // Sum even
        System.out.println("Sum even\n"+UtilsStream.sumOfEvenNumbers(ld));
        // Sum add
        System.out.println("Sum even\n"+UtilsStream.sumOfOfOddNumbers(ld));



        System.out.println("----------------------------------------------4. Remove duplicates from list using streams------------------------------------------------");
        List<String> listOfDuplicate = List.of("Anas","Ayman","Yahya","Jad","Anas");

        System.out.println("----------------------------------------------5. Count strings starting with letter using streams------------------------------------------------");

        System.out.println("List of Strings without duplicate elements  "+UtilsStream.removeDuplicate(listOfDuplicate));

        List<String> CountSST = List.of("Java","Python","Abap","TypeScript","JavaScript");

        System.out.println("Count strings starting with letter  "+UtilsStream.countNumberOfStringsStartWithSpecificLetter(CountSST,'J'));

        System.out.println("----------------------------------------------6. Sort strings A-Z and Z-A using streams------------------------------------------------");

        List<String> listForSort = new ArrayList<>();

        listForSort.add("Red");
        listForSort.add("Yellow");
        listForSort.add("Blue");
        listForSort.add("Green");
        listForSort.add("Grey");

        System.out.println("Sort List of Strings A-Z   "+UtilsStream.SortStringsAZ(listForSort));
        System.out.println("Sort List of Strings Z-A   "+UtilsStream.SortStringsZA(listForSort));


        System.out.println("----------------------------------------------7. Find max and min in list using streams------------------------------------------------");
        List<Integer> listTestMinMax = new ArrayList<>();

        listTestMinMax.add(1);
        listTestMinMax.add(4);
        listTestMinMax.add(6);
        listTestMinMax.add(7);
        listTestMinMax.add(12);
        listTestMinMax.add(78);
        listTestMinMax.add(0);

        System.out.println("For find the minimum value of list of integers  "+UtilsStream.findMin(listTestMinMax));
        System.out.println("For find the maximum value of list of integers  "+UtilsStream.findMax(listTestMinMax));


        System.out.println("----------------------------------------------8. Find 2nd smallest/largest using streams------------------------------------------------");
        List<Integer> listForFindSmallestOrLargestElement = List.of(78,2,64,2,36,4,6,4,7,9);

        System.out.println("The 2nd smallest value   "+UtilsStream.FindTwoSmalest(listForFindSmallestOrLargestElement));
        System.out.println("The 2nd largest value    "+UtilsStream.FindTwoLargest(listForFindSmallestOrLargestElement));

    }
}
