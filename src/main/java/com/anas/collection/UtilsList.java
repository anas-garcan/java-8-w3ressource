package com.anas.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UtilsList {
    public static List<String> addColors(List<String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the elements of the table");
        for (int i = 0; i <= n; i++) {
            String colors = scanner.next();
            list.add(colors);
        }
        return list;
    }



    public static  void parcour(List<Integer> p){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the elements of the table");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            p.add(element);

        }
        System.out.println("Step of iteration");
        for (int e : p)
        {
            System.out.println(e);
        }
    }


    public static  List<Integer> InsertElement(List<Integer> p,Integer elementInsert){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the table");
        for (int i = 1; i <= n; i++) {
            Integer element = scanner.nextInt();
            p.add(element);

        }
        p.add(0,elementInsert);
        System.out.println("All elements of list include the new element");
        for (Integer e : p)
        {
            System.out.println(e);
        }
        return p;
    }


    public static  Integer RetrieveElement(List<Integer> p){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the elements of the table");
        for (int i = 1; i <= n; i++) {
            Integer element = scanner.nextInt();
            p.add(element);

        }
        System.out.println("Enter the the element of retrieve");
        int ItemToRetrieve = scanner.nextInt();
        if (p.contains(ItemToRetrieve)) {
            int choice = scanner.nextInt();
            System.out.println("Enter the choice of element " +
                    "if you want to recuperate the fist occurrence Enter : 1" +
                    "if you want to recuperate the seconde occurrence Enter : 2");
            if (choice == 1)
                return p.get(p.indexOf(ItemToRetrieve));
            else if (choice == 2) {
                return p.get(p.lastIndexOf(ItemToRetrieve));
            } else {
                System.out.println("Error you must 1 or 2");
            }
        }
        else
            System.out.println("The element not exist");
        return ItemToRetrieve;
    }




    public static  List<Integer> EditElement(List<Integer> p){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the table");
        for (int i = 1; i <= n; i++) {
            Integer element = scanner.nextInt();
            p.add(element);

        }
        System.out.println("Enter the element for modify");
        int EditToEetrieve = scanner.nextInt();
        System.out.println("Enter index of modification");
        int indice = scanner.nextInt();
        p.set(indice,EditToEetrieve);
        System.out.println("Foreach of the elements");
        for (Integer e : p)
        {
            System.out.println(e);
        }

        return p;
    }


    public static  List<Integer> removeThirdElement(List<Integer> l){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();
        System.out.println("Enter the elements of the table");
        for (int i = 0; i < n; i++) {
            Integer element = scanner.nextInt();
            l.add(element);

        }
        System.out.println("Before Remove");
        for (Integer e : l)
        {
            System.out.println(e);
        }
        l.remove(2);
        System.out.println("After Remove");
        for (Integer e : l)
        {
            System.out.println(e);
        }

        return l;
    }


    public static  Integer searchElementInArrayList(List<Integer> l, Integer element){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre the size of the list");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the elements of the table");
        for (int i = 0; i < n; i++) {
            Integer e = scanner.nextInt();
            l.add(e);

        }
        int getIndex =l.indexOf(element);
        if (l.contains(element)){

            System.out.println("Index of element is "+getIndex);
            System.out.println("the element is "+element);
        }else {
            System.out.println("I can't this element , doesn't exist in the list elements");
        }


        System.out.println("The index of the element");
        return getIndex;
    }


    public static List<String> listSort(List<String> l){
        System.out.println("Before  "+l);
        Collections.sort(l);
        System.out.println("After  "+l);

        return l;

    }


    public static List<String> copyList(List<String> copiedList, List<String> ListForCopy)
    {
        System.out.println("Give me the Size of copiedList");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the elements of copied list");
        for (int i = 0; i <= n; i++) {
            String elementCopiedList = scanner.next();
            copiedList.add(elementCopiedList);
        }
        System.out.println("Give me the Size of copiedList");
        int s = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter the elements of the table");
        for (int i = 0; i <= s; i++) {
            String elementListForCopy = scanner.next();
            ListForCopy.add(elementListForCopy);
        }
        System.out.println("-----------------------------------");


        copiedList.addAll(ListForCopy);
        System.out.println("ListForCopy after Copy");

        for (String item : ListForCopy)
        {
            System.out.println(item);
        }
        return copiedList;
    }


    public static List<Double> mixList(List<Double> l){
        System.out.println("Enter the size of the list");
        Scanner scanner = new Scanner(System.in);
        Double n = scanner.nextDouble();
        System.out.println("Enter the elements of the table");
        for (int i = 0; i <= n; i++) {
            Double elmentOfList = scanner.nextDouble();
            l.add(elmentOfList);
        }
        System.out.println("List before it mixed  "+l);
        Collections.shuffle(l);
        System.out.println("List after shuffle");
        System.out.println("List after it mixed");

        return l;
    }


    public static List<Integer> reverseList(List<Integer> l){
        //   List<Integer> reverseList = l.reversed();
        Collections.reverse(l);
        return l;

    }

    public static List<Integer> listSubList(List<Integer> l , int fromIndex1 , int toIndex2)
    {
        return l.subList(fromIndex1,toIndex2);
    }


    public static Integer listComparaison(List<Integer> l1,List<Integer> l2){
        if (l1.equals(l2)) {
            System.out.println("l1 and l2 are egual");
            return 1;
        }
        else {
            System.out.println("l1 and l2  aren't égaux");
            return 0;
        }

    }



    public static List<String> listSwap(List<String> l,String elemnent1, String element2){
        Collections.swap(l,l.indexOf(elemnent1),l.indexOf(element2));
        return l;
    }



    public static List<Integer> listFusion(List<Integer> list1, List<Integer> list2){
        list1.addAll(list2);
        return list1;
    }


    public static List<Integer> cloneList(List<Integer> list1, List<Integer> list2)
    {
        list2 = new ArrayList<>(list1);
        return list2;
    }


    public static void clearListe(List<Integer> l)
    {
        l.clear();


    }


    public static int verifyIfListEmptyOrNot(List<Integer> l)
    {
        if (l.isEmpty()){
            System.out.println("The liste is empty");
            return -1;
        }
        else
        {
            System.out.println("The liste in not empty");
            return 1;
        }
    }


    public static List<Integer> reduceCapacityOfList(ArrayList<Integer> l)
    {
        l.trimToSize();
        return l;
    }



    public static List<String> increaseListCapacity(ArrayList<String> l)
    {
        l.ensureCapacity(40);
        return l;
    }


    public static List<String> replaceTheSecondElement(ArrayList<String> l,String value)
    {
        l.set(1,value);
        return l;
    }


    public static void printItemsPosition(List<String> l)
    {
        for (String  s: l)
        {
            System.out.println(s);
        }

    }
}
