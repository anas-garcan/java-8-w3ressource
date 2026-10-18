package com.anas.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

import static com.anas.functionalinterfaces.UtilsFunctionalInterfacesMethods.*;

public class MainFunctionalInterfaces {
    static void main() {
        System.out.println("1. Sum of two integers");
        int a = 10;
        int b = 20;
        UtilsFunctionalInterfacesMethods.sumOfTwoIntegers.accept(a,b);
        System.out.println("2. Check if a string is empty");
        System.out.println(UtilsFunctionalInterfacesMethods.emptyStringChecker.test(""));
        System.out.println(UtilsFunctionalInterfacesMethods.emptyStringChecker.test("Hello Word"));

        System.out.println("3. Convert string to uppercase and lowercase   "+UtilsFunctionalInterfacesMethods.upperCaseConverter.apply("java"));
        System.out.println("3. Convert string to lowercase   "+UtilsFunctionalInterfacesMethods.lowerCaseConverter.apply("JAVA"));

        System.out.println("4. Check if a number is even");
        System.out.println("Test even number  "+UtilsFunctionalInterfacesMethods.evenNumberChecker.test(7));
        System.out.println("Test even number  "+UtilsFunctionalInterfacesMethods.evenNumberChecker.test(8));

        System.out.println("6. Check if a number is odd");
        System.out.println("Test odd number  "+UtilsFunctionalInterfacesMethods.oddNumber.test(10));
        System.out.println("Test odd number  "+UtilsFunctionalInterfacesMethods.oddNumber.test(9));

        System.out.println("7. Calculate the average of a list of doubles");
        System.out.println(UtilsFunctionalInterfacesMethods.l.apply(Arrays.asList(10.0, 20.0, 30.0)));

        System.out.println("8. Calculate the factorial");
        System.out.println("factorielle "+UtilsFunctionalInterfacesMethods.factorielle.apply(5));

        System.out.println("9. Concatenate two strings");

        System.out.println("concatenate :"+UtilsFunctionalInterfacesMethods.concatenate.apply("Allez Allez Allez ","Toujours Thya Bladi bayda khadra Hbibti"));

        System.out.println("10. Find the maximum and the minimum  numbers");

        System.out.println("Find the maximum  "+UtilsFunctionalInterfacesMethods.numberMaximum.apply(List.of(1,5,6,65,47,58,66,140)));
        System.out.println("Find the minimum  "+UtilsFunctionalInterfacesMethods.numberMinimum.apply(List.of(5,6,65,47,58,66,140)));

        System.out.println("11. Calculate the sum of integers");
        System.out.println("Sum :\n"+UtilsFunctionalInterfacesMethods.intSumALL.apply(List.of(1,2,3,4,5,6,7,8,9,10)));

        System.out.println("12. Calculate the product of integers");
        System.out.println("Product :\n"+UtilsFunctionalInterfacesMethods.mutli.apply(List.of(1,2,3,4,5,6,7,8,9,10)));

        System.out.println("13. Count the number of words");
        System.out.println("Count the number of words \n"+UtilsFunctionalInterfacesMethods.countChar.apply("Bonjour tout le monde"));

        System.out.println("14. Check if a string is a palindrome");
        System.out.println("palindrome "+UtilsFunctionalInterfacesMethods.ifIsPalindrome.test("radar"));

        System.out.println("15. Calculate the sum of squares of even and odd numbers");
        System.out.println("The sum of squares "+UtilsFunctionalInterfacesMethods.sumSquaresOfIntegers.apply(Arrays.asList(10, 5, 20, 8, 15)));

        System.out.println("16. Check if a string is contained in a list");
        System.out.println("String is contained  :\n"+StringContain.apply(
                Arrays.asList("Apple", "Banana", "Orange"),
                "Banana"
        ));
        System.out.println("17. Check if a number is a perfect square");
        System.out.println("Perfect square "+ifIsPerfectSquare.test(25));

        System.out.println("18. Find the maximum string length and  minimum string length");
        System.out.println("The maximum string length :\n"+maxStringLength(
                Arrays.asList("Red", "Blue", "Yellow", "Green")
        ));

        System.out.println("The minimum string length : \n"+minStringLength(
                Arrays.asList("Red", "Blue", "Yellow", "Green")
        ));

        System.out.println("19. Find the second largest number and the second smallest number");
        System.out.println("The second largest number  \n"+secondLargest(
                new Integer[]{10, 5, 8, 20, 15}
        ));
        System.out.println(" Find the second smallest number : \n"+secondSmallest(
                new Integer[]{10, 5, 8, 20, 15}
        ));
        System.out.println("20. Sort objects by age");
        sortObject.accept(Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 20),
                new Person("Charlie", 25)
        ));

        System.out.println("21. Find the sum of prime numbers");
        System.out.println(sumOfPrimes.apply(1, 15));

        System.out.println("22. Check the case of strings");
        checkCase.accept(Arrays.asList("hello", "world"));

        System.out.println("23. Calculate the average string length");
        System.out.println(averageLength.apply(
                Arrays.asList("Java", "Hello", "Lambda")
        ));
        System.out.println("24. Convert an integer to binary");
        System.out.println(convertToBinary.apply(10));


    }
}

