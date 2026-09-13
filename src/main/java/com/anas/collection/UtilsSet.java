package com.anas.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UtilsSet {
    public static Set<Integer> addToSet(Set<Integer> s , Integer element) {
        s.add(element);
        return s;
    }

    public static void parcourirSet(Set<Integer> s)
    {
        for (Integer l : s)
        {
            System.out.println(l);
        }
    }

    public static int listSize(Set<Integer> s) {
        return s.size();
    }

    public static void setErase(Set<String> s)
    {
        if (s.isEmpty())
            System.out.println("Set is empty");
        else
            s.clear();

    }

    public static void ifHashSetEmpty(HashSet<String> s)
    {
        if (s.isEmpty())
            System.out.println("Hash set is empty");
        else
            System.out.println("Hash set is not empty");
    }

    public static Set<String> hashSetClone(HashSet<String> setForClone , HashSet<String> setReadyToClone )
    {
        setReadyToClone = new HashSet<>(setForClone);
        return setReadyToClone;
    }

    public static Integer[] setConvertToArray(HashSet<Integer> set)
    {
        return set.toArray(new Integer[0]);
    }

    public static TreeSet<Integer> convertSetToTreeSet(HashSet<Integer> set)
    {
        return new TreeSet<>(set);
    }

    public static void findElementInTreeSet(TreeSet<Integer> treeSet)
    {
        for (Integer i : treeSet)
        {
            if (i < 7)
            {
                System.out.println(i);
            }
        }
    }


    public static  void compareTwoHashSets(HashSet<String> s1, HashSet<String> s2)
    {
        if (s1.equals(s2))
            System.out.println("Les deux hashset sont égaux");
        else
            System.out.println("Les deux ne sont pas égaux");
    }

    public static Set<Integer> retainCommonElements(HashSet<Integer> s1, HashSet<Integer> s2)
    {
        HashSet<Integer> set3 = new HashSet<>();
        for (Integer s : s1)
        {
            if (s2.contains(s))
                set3.add(s);
        }

        System.out.println("les éléments identiques dans s1 et s2");
        return set3;
    }



    public static void removeHashSet(HashSet<Integer> set)
    {
        set.clear();
        System.out.println("Empty hashSet removed "+set);
    }
}
