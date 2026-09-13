package com.anas.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UtilsStream {
    public static Double avgOfList(List<Integer> l)
    {
        return l.stream().collect(Collectors.averagingInt(i->i));
    }



    public static List<String> ConvertStringsToUpperCase(List<String> l)
    {
        return l.stream()
                .map(String::toUpperCase)
                .toList();
    }
    public static List<String> ConvertStringsToLowerCase(List<String> l)
    {
        return l.stream()
                .map(String::toLowerCase)
                .toList();
    }


    public static Double sumOfEvenNumbers(List<Double> l)
    {
        return l.stream()
                .filter(e->e%2==0)
                .reduce(Double::sum)
                .get();
    }
    public static Double sumOfOfOddNumbers(List<Double> l)
    {
        return l.stream()
                .filter(e->e%2!=0)
                .reduce(Double::sum)
                .get();
    }

    public static List<String>  removeDuplicate(List<String> l)
    {
        System.out.println("Remove duplicate elements");
        return l.stream()
                .distinct()
                .toList();
    }



    public static long countNumberOfStringsStartWithSpecificLetter(List<String> s,char l)
    {
        return s.stream()
                .filter(s1->s1.startsWith(String.valueOf(l)))
                .count();
    }

    // Sort strings A-Z
    public static List<String> SortStringsAZ(List<String> l)
    {
        return l.stream()
                .sorted(String::compareTo)
                .toList();
    }
    // Sort strings Z-A
    public static List<String> SortStringsZA(List<String> l)
    {
        return l.stream()
                .sorted(Comparator.comparing(s->s.toString()).reversed())
                .toList();
    }

    // Find the max
    public static int findMax(List<Integer> l)
    {
        System.out.println("Max Value of a list of integer");
        return l.stream()
                .max(Comparator.comparingInt(a->a))
                .get();
    }
    // Find the min
    public static int findMin(List<Integer> l)
    {
        System.out.println("Min Value of a list of integer");
        return l.stream()
                .min(Comparator.comparingInt(a->a))
                .get();
    }

    // Find 2nd Largest
    public static int FindTwoLargest(List<Integer> l)
    {
        System.out.println("2nd largest value using stream");
        return l.stream()
                .distinct()
                .sorted(Comparator.comparingInt((Integer a) -> a).reversed())
                .skip(1)
                .findFirst()
                .get();
    }
    // Find 2nd Smallest
    public static int FindTwoSmalest(List<Integer> l)
    {
        System.out.println("2nd smallest value using stream");
        return l.stream()
                .distinct()
                .sorted(Comparator.comparingInt((Integer a)->a))
                .skip(1)
                .findFirst()
                .get();
    }

}
