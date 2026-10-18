package com.anas.functionalinterfaces;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class UtilsFunctionalInterfacesMethods {
    public static BiFunction<Integer,Integer,Integer> sumOfTwoIntegers = Integer::sum;

    public static Predicate<String> emptyStringChecker = String::isEmpty;

    public static Function<String,String> upperCaseConverter = String::toUpperCase;

    public static Function<String,String> lowerCaseConverter = String::toLowerCase;

    public static Predicate<Integer> evenNumberChecker  = n -> n % 2 == 0;

    public static Predicate<Integer> oddNumber = n -> n % 2 != 0;

    public static Function<List<Double>, Double> l = g -> g.stream().mapToDouble(Double::doubleValue).average().getAsDouble();

    public static Function<Integer, Integer> factorielle = n -> {
        int calcul = 1;
        for (int i = 1; i <= n; i++) {
            calcul *= i;
        }
        return calcul;


    };

    public static BiFunction<String,String,String> concatenate = (c1, c2) ->{
        return c1.concat(c2);
    };
    public static Function<List<Integer>, Integer> numberMaximum = l -> l.stream().max(Integer::compareTo).get();

    public static Function<List<Integer>, Integer> numberMinimum = l -> l.stream().min(Integer::compareTo).get();

    public static Function<List<Integer>,Integer> intSumALL = m -> m.stream().collect(Collectors.summingInt(p->p));

    public static Function<List<Integer>,Integer> mutli = m->m.stream().reduce(1,(a, b) -> a * b);

    public static Function<String,Integer> countChar = c->c.trim()
            .split("\\s+")
            .length;

    public static Predicate < String > ifIsPalindrome = str -> {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    };

    public static Function<List<Integer>,Integer> sumSquaresOfIntegers = ( l) ->{
        System.out.println("La sommme des nombres pairs"+l.stream().filter(n->n%2 ==0).mapToInt(n->n*n).sum());
        System.out.println("La sommme des nombres Impairs"+l.stream().filter(n->n%2 !=0).mapToInt(n->n*n).sum());
        return l.stream().filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum()
                + l.stream().filter(n -> n % 2 != 0)
                .mapToInt(n -> n * n)
                .sum();
    };

    public static BiFunction<List<String>, String, Boolean> StringContain = (list, element) -> list.contains(element);

    public static  Predicate< Integer > ifIsPerfectSquare = n -> {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    };
    public static int maxStringLength(List<String> list) {
        return list.stream()
                .mapToInt(s -> s.length())
                .max()
                .orElse(0);
    }

    public static int minStringLength(List<String> colors) {
        return colors.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
    }

    public static Integer secondLargest (Integer[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        return tab[tab.length - 2];
    }


    public static Integer secondSmallest(Integer[] tab) {
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i] > tab[j]) {
                    int temp = tab[i];
                    tab[i] = tab[j];
                    tab[j] = temp;
                }
            }
        }

        return tab[1];
    }

    public static Consumer<List<Person>> sortObject = people -> {
        people.sort(Comparator.comparingInt(Person::getAge));

        for (Person person : people){
            System.out.println(person);
        }

    };


    public static Predicate<Integer> primeNumberChecker = n ->{
        if (n < 2)

        return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    };
 public static BiFunction<Integer, Integer,Integer> sumOfPrimes = (begin,end) -> {
      int sum = 0;
      for (int i = begin; i < end; i++) {
          if (UtilsFunctionalInterfacesMethods.primeNumberChecker.test(i))
              sum+=i;
      }
      return sum;
  };



    public static Consumer<List<String>> checkCase = list -> {
        int lowers = 0;
        int uppers = 0;

        for (String l : list) {
            if (l.equals(l.toLowerCase())) {
                lowers++;
            } else if (l.equals(l.toUpperCase())) {
                uppers++;
            }
        }

        if (lowers == list.size()) {
            System.out.println("Les éléments de la liste sont en minuscules");
        } else if (uppers == list.size()) {
            System.out.println("Les éléments de la liste sont en majuscules");
        } else {
            System.out.println("Les éléments sont mixtes");
        }
    };

    public static Function<List<String>, Integer> averageLength = list -> {
        int sum = 0;

        for (String str : list) {
            sum += str.length();
        }

        return sum / list.size();
    };

    //  24. Trouvez le plus grand facteur premier en utilisant lambda -> pas encore fait



    public static Function<Integer,String> convertToBinary = Integer::toBinaryString;
}
